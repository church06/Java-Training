 

//1. Import
import java.sql.*;
import java.util.ArrayList;

public class Exercise5 {

	private static Connection con;

	/*
	 * This method returns an ArrayList that contains titles of all records in the 
	 * album table with price greater than the provided budget 
	 */
	public static ArrayList<String> getTitles(double budget) throws SQLException {
		
		//write missing code here
		ArrayList<String> output = new ArrayList<>();

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select title from album where price > " + budget);

			while (rs.next()) {
				output.add(rs.getString("title"));
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		return output;
		 
	}
	//This method return executes a query and return a  ResultSet
	public static ResultSet executeThisQuery(String query) {
		ResultSet rset = null;
		try (Statement stmt = con.createStatement()) {
			rset = stmt.executeQuery(query);

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return rset;
	}
	//This method return establishes a DB connection & return a boolean status 
	public static boolean establishDBConnection() {
		// Update the following with your postgres id and password
		String USER_Name = "postgres";
		String PASSWORD = "SDesolator_0211";
		try {
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection("jdbc:postgresql" + "://localhost:5432/postgres", USER_Name, PASSWORD);
			return con.isValid(2);// 2 second timeout

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;

	}
	//This method prints all of the values inside an ArrayList  
	public static void print(ArrayList<String> titles) {
		if (titles.size() == 0)
			System.out.print("No record found");
		else
			for (String title : titles) System.out.print("Titles are:" + title + "\n");

	}
	//main method
	public static void main(String[] args) throws SQLException {
		if (establishDBConnection()) {
			double budget =7.0; //change the value of budget
			print(getTitles(budget));
		} else
			System.out.println("Connection cannot be established");
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
