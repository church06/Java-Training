/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anis
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

//Client Thread Handler class
public class DBClientHandler extends Thread {
	private Database db;
	private Socket clientSocket;

	PrintWriter forClient = null;
	BufferedReader fromClient = null;

	public DBClientHandler(Socket client, Database db) {
		this.clientSocket = client;
		this.db = db;
	}

	@Override
	public void run() {

		try {
			// Message from client
			fromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			// Message for client
			forClient = new PrintWriter(clientSocket.getOutputStream(), true);

			String ClientMsg;
			while ((ClientMsg = fromClient.readLine()) != null) {

				double budget = Double.parseDouble(ClientMsg);

				System.out.printf(" Client sent the budget ", budget);

				// Query the Database & save result in ArrayList
				ArrayList<String> s = db.getTitles(budget);
				//Calculate the size of ArrayList
				int ctr = s.size();

				// Send reply to Client
				forClient.println(ctr + " records found");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}