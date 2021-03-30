import java.sql.*;
import java.util.Scanner;

public class Week5_Exq1 {

    public static void main(String[] args) {
        String username = "postgres";
        String password = "SDesolator_0211";

        String region = new Scanner(System.in).nextLine();

        try {

            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", username, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select region from label");

            int counter = 0;

            while (rs.next()) {
                if (rs.getString("region").equals(region)) {
                    counter++;
                    break;
                }
            }

            if (counter != 0) {
                System.out.println("delete successful. ヾ(•ω•`)o");
                stmt.executeUpdate("delete from label where region = '" + region + "'");
            } else {
                System.out.println("no such data found. (っ °Д °;)っ");
            }

            stmt.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
