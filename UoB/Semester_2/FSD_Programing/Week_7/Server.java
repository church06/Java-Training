/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * @author anis
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static ServerSocket server = null;
	private static Database db = null;

	public static boolean startServer() {

		// Server is listening on port
		try {
			server = new ServerSocket(5055);
			server.setReuseAddress(true);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	// Step 3: start listening to  clients & process their queries
	public static void processClientRequests() {
		while (true) {

			Socket clientSocket = null;

			try {
				clientSocket = server.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
			DBClientHandler clientH = new DBClientHandler(clientSocket, db);
			clientH.start();
			System.out.println("  ClientHandler started...");
		}

	}

	public static void main(String argv[]) {
		// Step 1 start the server
		if (!startServer()) {
			System.out.println("Server error");
		} else {
			System.out.println("Server is running \n Now connecting to DB");
			// Step 2 connect to DB
			db = new Database();
			if (!db.establishDBConnection()) {
				System.out.println("DB connection fail");
			} else {
				// Step 3: start listening to  clients & process their queries
				System.out.println("Server is now connected to DB ");
				processClientRequests();
			}

		}
	}

}// Class