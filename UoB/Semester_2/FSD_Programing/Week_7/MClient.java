
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author anis
 */
public class MClient {
    public static void main(String[] argv) throws IOException {
        String Msg = null;
        String MsgReceived;
        PrintWriter outToServer;
        BufferedReader inFromServer;
        Socket clientSocket = new Socket("127.0.0.1", 5051);
        try {

            System.out.println("Client Running ........");

            ClientHandler clientH = new ClientHandler(clientSocket);
            new Thread(clientH).start();

            Scanner inFromUserKeyboard = new Scanner(System.in);
            // writing to server
            outToServer = new PrintWriter(
                    clientSocket.getOutputStream(), true);

            // reading from server 
            inFromServer = new BufferedReader(new InputStreamReader(
                    clientSocket.getInputStream()));

            while (!"exit".equalsIgnoreCase(Msg)) {
                System.out.println("Type your message:");

                Msg = inFromUserKeyboard.nextLine();
                // Send Msg to the server
                outToServer.println(Msg);
                outToServer.flush();

                //Receive Msg from the server
                MsgReceived = inFromServer.readLine();
                // displaying server reply
                System.out.println("MSG FROM SERVER: " + MsgReceived);
            }
            // closing the scanner object
            inFromUserKeyboard.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
