package com.bham.fsd.groupmessenger;

import org.postgresql.util.PSQLException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class GroupMSGServer {

    private static String dbcommand = "jdbc:postgresql://localhost:5432/postgres";
    private static String db = "postgres";
    private static String pw = "SDesolator_0211";

    private static Connection conn;

    public static Connection getConnection() {
        return conn;
    }

    public GroupMSGServer() {

    }

    public ArrayList<String> getUserIDs() throws SQLException {

        ArrayList<String> output = new ArrayList<>();

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select usid from messageuser");

        while (rs.next()) {
            output.add(rs.getString("usid"));
        }

        rs.close();
        stmt.close();

        return output;
    }

    public ArrayList<String> getGroupUserIDs(int groupid) throws SQLException {

        ArrayList<String> output = new ArrayList<>();

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select usid from membership where groupid = " + groupid);

        while (rs.next()) {
            output.add(rs.getString("usid"));
        }

        rs.close();
        stmt.close();

        return output;
    }

    public ArrayList<ArrayList<String>> getGroupMessages(String groupname) throws SQLException {

        ArrayList<ArrayList<String>> output = new ArrayList<>();

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(
                "select displayname, groupname, messagetext " +
                        "from message " +
                        "natural join messagegroup, messageuser " +
                        "where message.usid = messageuser.usid and groupname = '" + groupname + "'");

        try {
            while (rs.next()) {
                ArrayList<String> i = new ArrayList<>();
                i.add(rs.getString("displayname"));
                i.add(rs.getString("groupname"));
                i.add(rs.getString("messagetext"));
                output.add(i);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        rs.close();
        stmt.close();

        return output;
    }

    public ArrayList<ArrayList<String>> getAllMessagesByUser(int usid) throws SQLException {
        ArrayList<ArrayList<String>> output = new ArrayList<>();

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(
                "select message.usid, displayname, groupname, messagetext " +
                        "from message " +
                        "natural join messagegroup, messageuser " +
                        "where message.usid = messageuser.usid and messageuser.usid = " + usid);

        try {
            while (rs.next()) {
                ArrayList<String> i = new ArrayList<>();
                i.add(rs.getString("displayname"));
                i.add(rs.getString("groupname"));
                i.add(rs.getString("messagetext"));
                output.add(i);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        rs.close();
        stmt.close();

        return output;
    }

    public ArrayList<String> getMostActiveUsers() throws SQLException {

        ArrayList<String> output = new ArrayList<>();

        Statement statement = conn.createStatement();

        ResultSet rs = statement.executeQuery(
                "select count(usid), displayname " +
                        "from message " +
                        "natural join messageuser " +
                        "group by usid, displayname " +
                        "order by count(usid) desc");
        int counter = 0;

        try {
            while (rs.next()) {

                int num = rs.getInt("count");
                if (num >= counter) {
                    counter = num;
                    output.add(rs.getString("displayname"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        rs.close();
        statement.close();

        return output;
    }

    public ArrayList<String> getInactiveUsers() throws SQLException {

        ArrayList<String> output = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select distinct messageuser.usid " +
                        "from messageuser " +
                        "left join message " +
                        "on messageuser.usid = message.usid " +
                        "where message.usid is null;");

        while (rs.next()) {
            output.add(rs.getString("usid"));
        }

        rs.close();
        stmt.close();

        return output;
    }

    public void addUser(String displayname, int phonenumber) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select usid from messageuser order by usid desc");
        int count = 0;
        if (rs.next()) {
            count = rs.getInt("usid");
        }
        count++;
        rs.close();
        try {
            statement.executeUpdate("insert into messageuser(usid, phonenumber, displayname) " +
                    "values (" + count + ", " + phonenumber + ", '" + displayname + "')");

        } catch (PSQLException e) {
            e.printStackTrace();
        }


        statement.close();
    }

    public void addUserToGroup(int usid, String groupname) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from messagegroup where groupname = '" + groupname + "'");
        int groupid = 0;

        while (rs.next()) {
            groupid = rs.getInt("groupid");
        }

        st.executeUpdate("insert into membership(groupid, usid) values(" + groupid + ","+ usid +")");
        rs.close();
        st.close();
    }

    public void addGroup(String groupname) throws SQLException {

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from messagegroup order by groupid desc limit 1");

        int count = 0;

        if (rs.next()) {
            count = rs.getInt("groupid");
        }
        count++;

        rs.close();
        try {
            statement.executeUpdate(
                    "insert into messagegroup (groupid, groupname) " +
                            "values (" + count + ",'" + groupname + "');");
        } catch (PSQLException e) {
            e.printStackTrace();
        }

        statement.close();
    }

    public void addMessage(int usid, int groupid, String text) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select messageid from message order by messageid desc limit 1");

        int count = 0;

        if (rs.next()) {
            count = rs.getInt("messageid");
        }
        count++;

        try {
            st.executeUpdate(
                    "insert into message(messageid,usid, groupid, messagetext) " +
                            "values (" + count + "," + usid + ","+groupid + ",'" + text +"'"+")");
        } catch (PSQLException e) {
            e.printStackTrace();
        }
        st.close();
    }

    // =================================================================================

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        GroupMSGServer gms = new GroupMSGServer();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        connectToDatabase();
        System.out.println(gms.getUserIDs());
        System.out.println(gms.getGroupUserIDs(0));

        System.out.println("getGroupMessages: ");
        for (ArrayList<String> i : gms.getGroupMessages("falloutgamers")) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("getAllMessagesByUser: ");
        for (ArrayList<String> i : gms.getAllMessagesByUser(0)) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println(gms.getMostActiveUsers());
        System.out.println(gms.getInactiveUsers());
        gms.addUser("SDesolator",1111111);
        gms.addUserToGroup(12, "wba4eva");

    }

	/* 

	Do not amend any of the code below

	*/


    public static void connectToDatabase() {

        try {
            conn = DriverManager.getConnection(dbcommand, db, pw);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetDatabase() {

        dropTables();

        ArrayList<String> defs = loadSQL("groupmsgdef");

        ArrayList<String> data = loadSQL("groupmsgdata");

        executeSQLUpdates(defs);
        executeSQLUpdates(data);
    }

    private void executeSQLUpdates(ArrayList<String> commands) {

        for (String query : commands) {

            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private ArrayList<String> loadSQL(String sqlfile) {

        ArrayList<String> commands = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sqlfile + ".sql"));

            String command = "";

            String line = "";

            while ((line = reader.readLine()) != null) {

                if (line.contains(";")) {
                    command += line;
                    command = command.trim();
                    commands.add(command);
                    command = "";
                } else {
                    line = line.trim();
                    command += line + " ";
                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return commands;

    }

    private void dropTables() {

        String[] commands = {
                "drop table message cascade;",
                "drop table messagegroup cascade",
                "drop table membership cascade",
                "drop table messageuser cascade"};

        for (String query : commands) {

            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
