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
import java.net.Socket;

class TCPClient {

    public static void main(String[] argv) throws Exception {
        String sentence;
        String modifiedSentence;
        System.out.println("Client Running");

        Socket clientSocket = new Socket("192.168.86.102", 8025);

        DataOutputStream outToServer =
                new DataOutputStream(clientSocket.getOutputStream());


        BufferedReader inFromServer =
                new BufferedReader(new
                        InputStreamReader(clientSocket.getInputStream()));

        //sentence = inFromUser.readLine(); 

        sentence = "hello";

        outToServer.writeBytes(sentence + '\n');

        modifiedSentence = inFromServer.readLine();

        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close();

    }
} 

