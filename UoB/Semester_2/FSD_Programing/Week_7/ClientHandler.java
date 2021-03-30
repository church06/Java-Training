
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anis
 */
public class ClientHandler implements Runnable {
    
    private final Socket  clientSocket;
    
    public ClientHandler(Socket client){
     this.clientSocket = client;
    }           

    @Override
    public void run() {
                
            try {
                PrintWriter out;
                BufferedReader in;

                // get the outputstream of client 
                out = new PrintWriter( 
                clientSocket.getOutputStream(), true); 

                // get the inputstream of client 
                in = new BufferedReader(  new InputStreamReader( 
                            clientSocket.getInputStream())); 
                String ClientMsg;
                while ((ClientMsg = in.readLine()) != null) {
                
                    System.out.printf( " Sent from the client: %s\n", new MServer().clientid);
                    
                    out.println(ClientMsg + " " + new Date().toString());
                }
            }catch (IOException e){
            e.printStackTrace();
            }
    }
    
}
