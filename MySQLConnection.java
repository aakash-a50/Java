import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "Class10100%";

        // Try to establish a connection
        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can now perform database operations here
                // Remember to close the connection when done
                connection.close();
            } else {
                System.out.println("Failed to connect to the database!");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
