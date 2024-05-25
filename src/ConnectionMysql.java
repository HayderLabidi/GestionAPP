import javax.swing.*;
import java.sql.*;

public class ConnectionMysql {

    public static Connection ConnectionDb() {
        Connection conn = null;
        System.out.println("Hello world!"); // Just a check to see if the method is being called

        try {
            // Step 1: Load the driver (not necessary in JDBC 4.0 and later)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Get the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gestionetud", "root", "");

            // Print message if connection successful
            System.out.println("Driver loaded Successfully");
            System.out.println("Database successfully connected.");

            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
