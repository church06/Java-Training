package com.bham.fsd.assignments;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Controller_Ass_2 {

    Socket socket = new Socket("192.168.86.101", 44444);
    ClientConnection client;
    JabberMessage jm;

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
        jm = client.feedback();
        return jm.getMessage();
    }

    public ArrayList<ArrayList<String>> data_respond() {
        return jm.getData();
    }

    public void disconnect() throws IOException {
        client.ois.close();
        client.oos.close();
        socket.close();
    }
}
