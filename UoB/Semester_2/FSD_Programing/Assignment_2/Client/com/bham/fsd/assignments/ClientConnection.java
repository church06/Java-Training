package com.bham.fsd.assignments;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;

public class ClientConnection implements Serializable {

    public transient String message;
    Socket socket;
    JabberDatabase jd;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    JabberMessage jm;

    String protocol;
    ArrayList<ArrayList<String>> data;

    public synchronized void run() throws IOException, ClassNotFoundException {

        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
        feedback();
    }

    public Connection connectionState() {
        return jd.getConnection();
    }

    public ClientConnection(Socket socket, JabberDatabase jd) {
        this.socket = socket;
        this.jd = jd;
    }

    public void login(String username) throws IOException {

        JabberMessage command = new JabberMessage("signin " + username);
        oos.writeObject(command);
        oos.flush();

    }

    public void register(String username) throws IOException {

        JabberMessage command = new JabberMessage("register " + username);
        oos.writeObject(command);
        oos.flush();
    }

    public void feedback() throws IOException, ClassNotFoundException {

        while (true) {
            jm = (JabberMessage) ois.readObject();

            protocol = jm.getMessage();
            data = jm.getData();

            System.out.println("feedback: " + protocol);
        }
    }

    public void getTimeline() throws IOException {

        JabberMessage command = new JabberMessage("timeline");
        oos.writeObject(command);
        oos.flush();
    }

    public void signOut() throws IOException {

        JabberMessage command = new JabberMessage("signout");
        oos.writeObject(command);
        oos.flush();
        System.out.println("signOut: sent.");
    }

}
