import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient_self {

    public static void main(String[] args) throws IOException {

        String input;
        String respond;
        System.out.println("Running...");

        Socket socket = new Socket("192.168.86.102", 8888);

        DataOutputStream output= new DataOutputStream(socket.getOutputStream());
        BufferedReader server = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        input = "hello";
        output.writeBytes(input + "\n");
        respond = server.readLine();
        System.out.println("From server: " + respond);

        socket.close();
    }
}
