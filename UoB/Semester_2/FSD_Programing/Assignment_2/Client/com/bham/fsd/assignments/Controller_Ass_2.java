package com.bham.fsd.assignments;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Controller_Ass_2 {

    Socket socket = new Socket("192.168.86.101", 44444);
    ClientConnection client;

    String protocol;
    ArrayList<ArrayList<String>> data;


    public Controller_Ass_2() throws IOException {
        new Thread(() -> {
            client = new ClientConnection(socket, new JabberDatabase());

            try {
                client.run();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }).start();

    }

    public void login(String username) throws IOException {
        client.login(username);
    }

    public void register(String username) throws IOException {
        client.register(username);
    }

    public String server_respond() throws IOException, ClassNotFoundException {

        JabberMessage jm = client.feedback();

        protocol = jm.getMessage();
        data = jm.getData();

        System.out.println("controller_protocol: " + protocol);
        System.out.println("controller_data: " + data);

        return protocol;
    }

    public ArrayList<ArrayList<String>> data_respond() throws IOException, ClassNotFoundException {
        System.out.println("data_respond: " + client.jm.getMessage());
        return data;
    }

    public void signOut() throws IOException {
        client.signOut();
        client.ois.close();
        client.oos.close();
        socket.close();
    }

    public void timeLine() throws IOException {
        client.getTimeline();
    }
}
