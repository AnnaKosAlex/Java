package levelthree.lesson3_2;


import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        System.out.println(connection);

        UserService service = new UserService();

        System.out.println(service.findAll());
    }

}
