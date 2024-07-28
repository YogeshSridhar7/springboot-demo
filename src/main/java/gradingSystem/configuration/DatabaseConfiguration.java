package gradingSystem.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfiguration {
    public static Connection getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded.");
        String url = "jdbc:postgresql://localhost:5432/myproject";
        return DriverManager.getConnection(url, "postgres", "sa");
    }
}
