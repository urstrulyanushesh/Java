import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/ablim";

        String username="root";
        String password="AdminUser";

        try(Connection connection = DriverManager.getConnection(url,username,password)){
            System.out.println("Connection to the database.");
            System.out.println(connection );

        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}