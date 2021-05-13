import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class TCPServer_self {

    public static void main(String[] args) throws IOException {
        String client;
        String respond = "[ Convert word - ";

        ServerSocket income = new ServerSocket(8888);
        System.out.println("Running...");

        while (true) {

            Socket socket = income.accept();

            BufferedReader clientStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream serverString = new DataOutputStream(socket.getOutputStream());

            client = clientStream.readLine();
            System.out.println(client);

            for (int i = client.length() - 1; i >= 0; i--) {
                respond = respond + client.charAt(i);
            }

            respond = respond.toUpperCase(Locale.ROOT) + " ].\n";
            serverString.writeBytes(respond);
        }
    }
}
