package com.bham.fsd.assignments;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.sql.Connection;

public class ClientConnection implements Serializable {

    public String message;
    Socket socket;
    JabberDatabase jd;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    public JabberMessage jm;

    public void run() throws IOException, ClassNotFoundException {

        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
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

    public JabberMessage feedback() throws IOException, ClassNotFoundException {
        return (JabberMessage) ois.readObject();
    }
}
