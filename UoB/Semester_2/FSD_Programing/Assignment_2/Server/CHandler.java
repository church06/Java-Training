
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;

public class CHandler implements Runnable {
    private Socket socket;
    JabberMessage message;
    JabberDatabase jd;

    public CHandler(Socket clientSocket) {
        this.socket = clientSocket;
    }

    @Override
    public void run() {
        try {
            test_2 server = new test_2();
            ObjectOutputStream send = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            while (true) {

                try {
                    JabberMessage data_receive;

                    data_receive = (JabberMessage) ois.readObject();
                    System.out.println("Socket input: " + data_receive.getMessage());

                    String letter = data_receive.getMessage();
                    System.out.println("String is: " + letter);

                    String[] command = new String[2];
                    String pro;
                    String content;


                    switch (letter) {
                        default:

                            for (int i = 0; i < letter.length(); i++) {

                                if (letter.charAt(i) == ' ') {
                                    pro = letter.substring(0, i).trim();
                                    content = letter.substring(i + 1);

                                    command[0] = pro;
                                    command[1] = content;
                                }
                            }
                            break;

                        case "timeline":
                        case "signout":
                        case "users":
                            command[0] = letter;
                            command[1] = null;

                            break;
                    }



                    System.out.println("Input command: " + Arrays.toString(command));
                    // command store
//                    String[] command = data_receive.getMessage().split(" ");
//                    System.out.println(Arrays.toString(command));

                    // judge command format & respond client message
                    server.protocol_respond(command, send);

                } catch (IOException | ClassNotFoundException e) {
                    ois.close();
                    send.close();

                    System.out.println("Client Offline.");

                    break;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}