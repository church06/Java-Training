package bham.fsd.assignments.jabberserver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class JabberServer {
    //127.0.0.1:5432
    private static String dbcommand = "jdbc:postgresql://localhost:5432/postgres";
    private static String db = "postgres";
    private static String pw = "SDesolator_0211";

    private static Connection conn;

    public static Connection getConnection() {
        return conn;
    }

    public static void main(String[] args) throws SQLException {

        JabberServer jabber = new JabberServer();
        JabberServer.connectToDatabase();
        jabber.resetDatabase();

        /*
         * Put calls to your methods here to test them.
         */

        print1(jabber.getFollowerUserIDs(0));
        System.out.println();

        print1(jabber.getFollowingUserIDs(0));
        System.out.println();

        print2(jabber.getLikesOfUser(0));
        System.out.println();

        print2(jabber.getTimelineOfUser(0));
        System.out.println();

        print2(jabber.getMutualFollowUserIDs());
        System.out.println();

        jabber.addUser("etdyjut", "sdfger@aeddfg.com");
        jabber.addJab("kim", "s;dkfubhaslibalhgaldgadl");
        jabber.addFollower(7, 12);
        jabber.addLike(0, 12);

        print1(jabber.getUsersWithMostFollowers());
    }

    public ArrayList<String> getFollowerUserIDs(int userid) throws SQLException {

        ArrayList<String> output = new ArrayList<>();
        /*
         * Add your code to this method here.
         * Remove the 'return null' statement and add your own return statement.
         */

        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select userid, userida " +
                    "from follows, jabberuser " +
                    "where useridb = userid and userid = " + userid);

            while (rs.next()) {
                String i = rs.getString("userida");
                output.add(i);
            }

            st.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    public ArrayList<String> getFollowingUserIDs(int userid) throws SQLException {

        ArrayList<String> output = new ArrayList<>();
        /*
         * Add your code to this method here.
         * Remove the 'return null' statement and add your own return statement.
         */
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "select userida, userid from follows, jabberuser " +
                            "where useridb = jabberuser.userid and userida = " + userid);

            while (rs.next()) {
                String i = rs.getString("userid");
                output.add(i);
            }

            st.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    public ArrayList<ArrayList<String>> getMutualFollowUserIDs() throws SQLException {

        ArrayList<ArrayList<String>> output = new ArrayList<>();

        /*
         * Add your code to this method here.
         * Remove the 'return null' statement and add your own return statement.
         */

        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "select table1.userida, table1.useridb, table2.userida, table2.useridb " +
                            "from follows table1 " +
                            "inner join follows table2 " +
                            "on table1.userida = table2.useridb and table1.useridb = table2.userida");

            ArrayList<int[]> i = new ArrayList<>();

            while (rs.next()) {
                int[] temp = new int[2];
                temp[0] = rs.getInt("userida");
                temp[1] = rs.getInt("useridb");
                i.add(temp);
            }

            for (int j = 0; j < i.size(); j++) {
                int[] i_st = i.get(j);

                for (int k = j + 1; k < i.size(); k++) {
                    int[] i_nd = i.get(k);

                    if (i_st[0] == i_nd[1] && i_st[1] == i_nd[0]) {

                        ArrayList<String> container = new ArrayList<>();

                        container.add(i_st[0] + "");
                        container.add(i_st[1] + "");

                        output.add(container);
                    }
                }
            }

            st.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    public ArrayList<ArrayList<String>> getLikesOfUser(int userid) throws SQLException {

        ArrayList<ArrayList<String>> output = new ArrayList<>();

        /*
         * Add your code to this method here.
         * Remove the 'return null' statement and add your own return statement.
         */

        String command = "select username, jabtext " +
                "from jabberuser, jab, likes " +
                "where jab.jabid = likes.jabid and jabberuser.userid = jab.userid and likes.userid = " + userid;
        try {
            PreparedStatement rst = conn.prepareStatement(command);
            ResultSet rs = rst.executeQuery();

            while (rs.next()) {
                ArrayList<String> i = new ArrayList<>();
                i.add(rs.getString("username"));
                i.add(rs.getString("jabtext"));
                output.add(i);
            }

            rst.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    public ArrayList<ArrayList<String>> getTimelineOfUser(int userid) {

        ArrayList<ArrayList<String>> output = new ArrayList<>();

        /*
         * Add your code to this method here.
         * Remove the 'return null' statement and add your own return statement.
         */

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "select jabid, idtext.userid, username, jabtext" +
                            " from jabberuser" +
                            " join (select jabid, userid, jabtext" +
                            " from jab" +
                            " join (select useridb" +
                            " from follows where userida = " + userid + ") as  follows" +
                            " on follows.useridb = jab.userid) as idtext on jabberuser.userid = idtext.userid" +
                            " order by idtext.jabid");

            while (rs.next()) {
                ArrayList<String> i = new ArrayList<>();
                i.add(rs.getString("username"));
                i.add(rs.getString("jabtext"));
                output.add(i);
            }

            st.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    public void addJab(String username, String jabtext) throws SQLException {

        /*
         * Add your code to this method here.
         */

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select jabid from jab order by jabid desc limit 1");

        int counter = 0;
        while (rs.next()) {
            counter = rs.getInt("jabid") + 1;
        }

        ResultSet rs1 = st.executeQuery("select userid from jabberuser where username = '" + username + "'");

        int userid = 0;
        while (rs1.next()) {
            userid = rs1.getInt("userid");
        }

        st.executeUpdate("insert into jab(jabid, userid, jabtext) " +
                "values(" + counter + "," + userid + ",'" + jabtext + "'" + ")");

        rs.close();
        st.close();
    }

    public void addUser(String username, String emailadd) throws SQLException {

        /*
         * Add your code to this method here.
         */

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select userid from jabberuser order by userid desc limit 1");

        int count = 0;

        while (rs.next()) {
            count = rs.getInt("userid") + 1;
        }

        st.executeUpdate("insert into jabberuser(userid, username, emailadd) " +
                "values (" + count + ", '" + username + "', " + "'" + emailadd + "'" + ")");

        st.close();
        rs.close();
    }

    public void addFollower(int userida, int useridb) throws SQLException {

        /*
         * Add your code to this method here.
         */

        Statement st = conn.createStatement();
        st.executeUpdate("insert into follows(userida, useridb) values(" + userida + ", " + useridb + ")");

        st.close();
    }

    public void addLike(int userid, int jabid) throws SQLException {
        /*
         * Add your code to this method here.
         */

        Statement st = conn.createStatement();
        st.executeUpdate("insert into likes(userid, jabid) values (" + userid + "," + jabid + ")");

        st.close();
    }

    public ArrayList<String> getUsersWithMostFollowers() throws SQLException {

        ArrayList<String> output = new ArrayList<>();

        /*
         * Add your code to this method here.
         * Remove the 'return null' statement and add your own return statement.
         */

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select count(userida), username " +
                "from follows, jabberuser " +
                "where useridb = userid " +
                "group by username " +
                "order by count(userida) desc");

        int counter = 0;

        while (rs.next()) {
            int i = rs.getInt("count");

            if (rs.getInt("count") >= counter) {
                counter = i;
                String names = rs.getString("username");
                output.add(names);
            }

        }

        st.close();
        rs.close();

        return output;
    }

    public JabberServer() {
    }

    public static void connectToDatabase() {

        try {
            conn = DriverManager.getConnection(dbcommand, db, pw);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Utility method to print an ArrayList of ArrayList<String>s to the console.
     */
    private static void print2(ArrayList<ArrayList<String>> list) {

        for (ArrayList<String> s : list) {
            print1(s);
            System.out.println();
        }
    }

    /*
     * Utility method to print an ArrayList to the console.
     */
    private static void print1(ArrayList<String> list) {

        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    public void resetDatabase() {

        dropTables();
        // jabberdef
        ArrayList<String> defs = loadSQL("G:\\Entrance\\Coding_Training\\JavaProgram\\SQL_Data\\Assignment_1\\jabberdef");
        // jabberdata
        ArrayList<String> data = loadSQL("G:\\Entrance\\Coding_Training\\JavaProgram\\SQL_Data\\Assignment_1\\jabberdata");

        executeSQLUpdates(defs);
        executeSQLUpdates(data);
    }

    private void executeSQLUpdates(ArrayList<String> commands) {

        for (String query : commands) {

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.executeUpdate();
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
                "drop table jabberuser cascade;",
                "drop table jab cascade;",
                "drop table follows cascade;",
                "drop table likes cascade;"};

        for (String query : commands) {

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
