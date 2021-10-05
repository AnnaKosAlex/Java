package levelthree.lesson3_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            /**
             DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENTS?user=root&password=root");
             */

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Users",
                    "Anna",
                    "root"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(Connection connection) {
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

