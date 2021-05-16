package com.bham.fsd.assignments;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
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

    public synchronized void run() {

        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            feedback();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection connectionState() {
        return jd.getConnection();
    }

    public ClientConnection(Socket socket, JabberDatabase jd) {
        this.socket = socket;
        this.jd = jd;
    }

    public void login(String username) {

        try {
            JabberMessage command = new JabberMessage("signin " + username);
            oos.writeObject(command);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void register(String username) {

        try {
            JabberMessage command = new JabberMessage("register " + username);
            oos.writeObject(command);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void feedback() {

        while (true) {
            try {
                jm = (JabberMessage) ois.readObject();

                protocol = jm.getMessage();
                data = jm.getData();

                System.out.println("\nfeedback: " + protocol);
                System.out.println("Connection Data: " + data);

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Sign Out.");
                break;
            }
        }
    }

    public void getTimeline() {

        try {
            JabberMessage command = new JabberMessage("timeline");
            oos.writeObject(command);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void signOut() throws IOException {

        try {
            JabberMessage command = new JabberMessage("signout");
            oos.writeObject(command);
            oos.flush();

        } catch (SocketException e) {
            socket = new Socket();

            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        }

        System.out.println("signOut: sent.");
    }

    public void like(String jab) {

        try {
            JabberMessage command = new JabberMessage("like " + jab);
            oos.writeObject(command);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void notFollowed() {

        try {
            JabberMessage command = new JabberMessage("users");
            oos.writeObject(command);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
