
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anis
 */
public class MServer {
    
    private static final ArrayList<ClientHandler> client = new ArrayList<>();

    public int clientid;
    
    private static final ExecutorService pool = Executors.newFixedThreadPool(3);
    
    public static void main (String[] argv) throws IOException  {

        try (ServerSocket server = new ServerSocket(5051)) {

            // Server is listening on port 7091
            server.setReuseAddress(true);


            System.out.println("Server waiting for connection");
            while (true) {
                Socket clientSocket = server.accept();

                System.out.println("Info client" + clientSocket.getInetAddress().getCanonicalHostName());

                ClientHandler clientH = new ClientHandler(clientSocket);
                client.add(clientH);

                new Thread(clientH).start();

                pool.execute(clientH);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
