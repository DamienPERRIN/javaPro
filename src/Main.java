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

//        System.out.println("Hello World!");

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("url", "user", "password");
//            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            Statement st = conn.createStatement();
            resultSet rs = st.executeQuery("SELECT * FROM Customers");

            while (rs.next()){
                String name = rs.getString("Name");
//                ...TODO
            }
            rs.close();
        } catch(ClassNotFoundException cnf) {
            System.out.println("Le pilote est introuvable");
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        } finally {

        }

    }
}
