/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author anis
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {

    public static void main(String[] argv) throws Exception {
        String clientSentence;
        String reverseSentence = "111!";


        ServerSocket welcomeSocket = new ServerSocket(8025);
        System.out.println("Server  Running");

        while (true) {

            Socket connectionSocket = welcomeSocket.accept();

            BufferedReader inFromClient =
                    new BufferedReader(new
                            InputStreamReader(connectionSocket.getInputStream()));

            DataOutputStream outToClient =
                    new DataOutputStream(connectionSocket.getOutputStream());

            clientSentence = inFromClient.readLine();
            System.out.println("Server  sentence " + clientSentence);
            for (int i = clientSentence.length() - 1; i >= 0; i--) {
                reverseSentence = reverseSentence + clientSentence.charAt(i);
            }


            reverseSentence = reverseSentence.toUpperCase() + '\n';

            outToClient.writeBytes(reverseSentence);
        }
    }
} 

