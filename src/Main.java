import java.sql.*;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Main obj_DB_Connection = new DB_Connection();
        System.out.println(obj_DB_Connection.get_connection());
    }

    public Connection get_connection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Customers","root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
