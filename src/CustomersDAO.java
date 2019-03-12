import CustomersMetier.Customers;

import java.sql.*;
import java.util.*;

public class CustomersDAO
{
    public static final String DBURL = "jdbc:mysql://localhost:3306/Customers";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static int createCustomer() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        String sql = "INSERT INTO customer (fullname, password, email, country) VALUES (?, ?, ?, ?)";
        assert conn != null;
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, "Billy the kid");
        st.setString(2, "secretpass");
        st.setString(3, "billy@free.fr");
        st.setString(4, "USA");

        int rowInserted = st.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("A new customer was inserted"); //retour en console
        }
        return rowInserted;
    }

    public static List<Customers> displayCustomers() throws SQLException
    {
        Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        String sql = "SELECT * FROM customer";
        assert conn != null;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            String fullname = rs.getString(1);
            String password = rs.getString(2);
            String email = rs.getString(3);
            String country = rs.getString(4);
            System.out.println(String.format(fullname, password, email, country)); //retour en console
        }
        return null;
    }

    public static int update(CustomersDAO id) throws SQLException
    {
        Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        String sql = "UPDATE customer SET fullname=?, password=?, email=?, country=? WHERE id="+id;
        assert conn != null;

        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, "John Snow");
        st.setString(2, "secrectJohn");
        st.setString(3, "jsnow@GOT.com");
        st.setString(4, "nightWatch");

        int rowsUpdated = st.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Customer n°"+id+" was updated!"); //retour en console
        }
        return rowsUpdated;
    }

    public static int delete(CustomersDAO id) throws SQLException
    {
        Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        String sql = "DELETE FROM Users WHERE username=?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "bill");

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Customer n°"+id+" was deleted!"); //retour en console
        }
        return rowsDeleted;
    }
}