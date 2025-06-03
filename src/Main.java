import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // Database details
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root";
        String password = "admin";

        // SQL query to create student table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS student ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(100) NOT NULL, "
                + "age INT NOT NULL, "
                + "email VARCHAR(100))";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(createTableSQL);
            System.out.println("Student table created successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


