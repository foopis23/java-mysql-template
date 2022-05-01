import java.sql.*;

public class Main {
    public static void main(String[] args){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exampledb", "root", "example");
            Statement statement = connection.createStatement();

            ResultSet results = statement.executeQuery("select id,name from users");

            while(results.next()) {
                System.out.print(results.getInt("id"));
                System.out.print(" " + results.getString("name") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
