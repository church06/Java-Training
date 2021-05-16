import com.bham.fsd.assignments.JabberMessage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;

public class CHandler implements Runnable{
    private Socket socket;

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

                    // command store
                    String[] command = data_receive.getMessage().split(" ");
                    System.out.println(Arrays.toString(command));

                    // judge command format & respond client message
                    if (command.length == 2) {
                        server.protocol_respond(command, send);
                    } else {
                        server.protocol_respond(new String[]{command[0], ""}, send);
                    }

                } catch (IOException | ClassNotFoundException e) {
                    ois.close();
                    send.close();

                    System.out.println("Client Offline.");

                    socket = new Socket();
                    ois = new ObjectInputStream(socket.getInputStream());
                    send = new ObjectOutputStream(socket.getOutputStream());

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
