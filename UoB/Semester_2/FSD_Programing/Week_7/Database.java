/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anis
 */
/*
 * Example of SQL Select
 * JDBC driver postgresql-42.2.18.jar required
 * Date: 14 Feb 2021
 * 
 */

//1. Import
import java.sql.*;
import java.util.ArrayList;

public class Database {

	private  Connection con;

	public  Connection getCon() {
		return con;
	}

	public  void setCon(Connection con) {
		this.con = con;
	}

	/*
	 * This method returns an ArrayList that contains titles of all records in the
	 * album table with price greater than the provided budget
	 */
	public  ArrayList<String> getTitles(double budget) {

		ArrayList<String> titles = new ArrayList<String>();

		String query = "SELECT title FROM album WHERE price <" + budget;
		ResultSet rset = executeThisQuery(query);

		try {
			while (rset.next()) {
				titles.add(rset.getString("title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return titles;
	}

	// This method return executes a query and return a ResultSet
	public  ResultSet executeThisQuery(String query) {
		ResultSet rset = null;
		try {
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rset;
	}

	// This method return establishes a DB connection & return a boolean status
	public   boolean establishDBConnection() {
		// Update the following with your postgres id and password
		String USER_Name = "postgres";
		String PASSWORD = "root";
		try {
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection("jdbc:postgresql" +
					"://localhost:5432/postgres", USER_Name, PASSWORD);
			return con.isValid(2);// 2 second timeout

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;

	}

	 

	 
}