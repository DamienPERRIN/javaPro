import java.sql.*;

/**
 * The type Main.
 */
public class Main extends CustomersDAO {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args, CustomersDAO id) {

//        System.out.println("Hello World!");

        try(Connection conn = DriverManager.getConnection(CustomersDAO.DBURL, CustomersDAO.USERNAME, CustomersDAO.PASSWORD)) { // try-with-ressources

//            switch (action){
//                case "create": CustomersDAO.createCustomer();
//                    break;
//                case "edit": CustomersDAO.update(id);
//                    break;
//                case "delete": CustomersDAO.delete(id);
//                    break;
//                case "read": CustomersDAO.displayCustomers();
//                    break;
//            }

        } catch(NullPointerException npe) {
            System.out.println("La connexion n'a pas été établie");
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }

    }
}
