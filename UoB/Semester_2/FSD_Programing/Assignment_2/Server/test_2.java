//import com.bham.fsd.assignments.JabberDatabase;
//import com.bham.fsd.assignments.JabberMessage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class test_2 {

    JabberDatabase jd = new JabberDatabase();
    JabberMessage jm;
    private String username;
    private int userid;


    public synchronized static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {


//        test_2 server = new test_2();

//        JabberMessage data_receive;

        ServerSocket income;

        income = new ServerSocket(44444);

        System.out.println("Running...");

        while (true) {
            Socket socket = income.accept();
            CHandler cHandler = new CHandler(socket);
            new Thread(cHandler).start();
        }


//        ObjectOutputStream send = new ObjectOutputStream(socket.getOutputStream());
//        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//
//        while (true) {
//
//            try {
//
//
//                data_receive = (JabberMessage) ois.readObject();
//
//                // command store
//                String[] command = data_receive.getMessage().split(" ");
//                System.out.println(Arrays.toString(command));
//
//                // judge command format & respond client message
//                if (command.length == 2) {
//                    server.protocol_respond(command, send);
//                } else {
//                    server.protocol_respond(new String[]{command[0], ""}, send);
//                }
//
//            } catch (IOException | ClassNotFoundException e) {
//                ois.close();
//                send.close();
//
//                System.out.println("Client Offline.");
//
//                socket = income.accept();
//                ois = new ObjectInputStream(socket.getInputStream());
//                send = new ObjectOutputStream(socket.getOutputStream());
//
//            }
//
//        }
    }


    public void protocol_respond(String[] command, ObjectOutputStream send) throws IOException {

        System.out.println(Arrays.toString(command));

        String protocol = command[0];
        String content = command[1];

        System.out.println("content: " + content);

        switch (protocol) {
            default:
                errorDetect(send);
                break;

            case "signin":
                if (!content.equals("")) {
                    if (jd.getUserID(content) != -1) {

                        System.out.println("signedin");

                        jm = new JabberMessage("signedin");
                        send.writeObject(jm);

                    } else {
                        errorDetect(send);
                    }

                    username = command[1];
                    userid = jd.getUserID(username);

                } else {
                    errorDetect(send);
                }
                send.flush();
                break;

            case "register":
                if (!content.equals("")) {
                    if (jd.getUserID(content) == -1) {
                        jd.addUser(content, "N/A");

                        jm = new JabberMessage("signedin");
                        send.writeObject(jm);
                        send.flush();

                    } else {
                        errorDetect(send);
                    }
                } else {
                    errorDetect(send);
                }
                break;

            case "signout":
                System.out.println("Client Offline.");
                break;

            case "timeline"://，登陆已经获得登录用户的userid和username 注意输出格式 one row for each jab in the timeline
                ArrayList<ArrayList<String>> timelineOfUserEx = jd.getTimelineOfUserEx(username);
                jm = new JabberMessage("timeline", timelineOfUserEx);
                send.writeObject(jm);
                break;

            case "users":
                ArrayList<ArrayList<String>> usersNotFollowed1 = jd.getUsersNotFollowed(userid);
                jm = new JabberMessage("users", usersNotFollowed1);
                send.writeObject(jm);
//                forClient.flush();
                break;
            case "like":

                jd.addLike(userid, Integer.parseInt(command[1]));//将第二个元素转换成int类型
                jm = new JabberMessage("posted");
                send.writeObject(jm);
                break;

            case "follow":
                int useridb = jd.getUserID(command[1]);
                jd.addFollower(userid, useridb);
                jm = new JabberMessage("posted");
                send.writeObject(jm);
                break;

            case "post":
                jd.addJab(username, command[1]);
                jm = new JabberMessage("posted");
                send.writeObject(jm);
                break;
        }
    }

    private void errorDetect(ObjectOutputStream send) {

        try {
            System.out.println("Error detect: unknown-user");
            jm = new JabberMessage("unknown-user");
            send.writeObject(jm);
            send.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
