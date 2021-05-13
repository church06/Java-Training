import com.bham.fsd.assignments.JabberDatabase;
import com.bham.fsd.assignments.JabberMessage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

    JabberDatabase jd = new JabberDatabase();
    JabberMessage jm;

    public synchronized static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        test server = new test();

        JabberMessage data_receive;

        ServerSocket income = new ServerSocket(44444);
        System.out.println("Running...");
        boolean printed = false;

        Socket socket = income.accept();

        ObjectOutputStream send = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        while (true) {
            try {
                data_receive = (JabberMessage) ois.readObject();

                // command store
                String[] command = data_receive.getMessage().split(" ");
                System.out.println(Arrays.toString(command));

                // judge command format & respond client message
                if (command.length == 2) {
                    server.protocol_respond(command, send);
                } else {
                    server.protocol_respond(new String[]{"", ""}, send);
                }

            } catch (SocketException | EOFException e) {
                ois.close();
                send.close();

                System.out.println("Client Offline.");

                socket = income.accept();
                ois = new ObjectInputStream(socket.getInputStream());
                send = new ObjectOutputStream(socket.getOutputStream());

            }

        }
    }

    private void protocol_respond(String[] command, ObjectOutputStream send) throws IOException {

        String protocol = command[0];
        String content = command[1];

        switch (protocol) {
            default:
                System.out.println("default: unknown-user");
                jm = new JabberMessage("unknown-user");
                send.writeObject(jm);
                send.flush();
                break;

            case "signin":

                if (jd.getUserID(content) != -1) {

                    System.out.println("signedin");

                    ArrayList<ArrayList<String>> output = jd.getTimelineOfUserEx(content);

                    jm = new JabberMessage("signedin", output);
                    send.writeObject(jm);

                } else {
                    System.out.println("signin: unknown-user");
                    jm = new JabberMessage("unknown-user");
                    send.writeObject(jm);
                }

                send.flush();
                break;

            case "register":
                if (jd.getUserID(content) == -1) {
                    jd.addUser(content, "N/A");

                    jm = new JabberMessage("signedin");
                    send.writeObject(jm);
                    send.flush();
                }
                break;
        }
    }

}
