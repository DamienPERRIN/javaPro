import CustomersMetier.Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomersDAO
{
    public static int create(Customers custom)
    {
        int status = 0;
//        Insert new customer in database;
        return status;
    }

    public static List<Customers> read()
    {
        List<Customers> cList = new ArrayList<>();
//        Display customer list;
        return cList;
    }

    public static int update(Customers custom, int id)
    {
        int status = 0;
//        Update database with specific customer;
        return status;
    }

    public static int delete(int id)
    {
        int status = 0;
//        Delete select customer in database;
        return status;
    }
}