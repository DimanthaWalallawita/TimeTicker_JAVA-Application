package DBAccess;

import DBConnection.DatabaseConnection;
import Models.Customer;

public class CustomerAccess {

    private DatabaseConnection singleconnection;

    public CustomerAccess() {
        singleconnection = DatabaseConnection.getSingleInstance();
    }

    public boolean addCustomerToDB(Customer cus) {
        try {
            String query = "Insert Into customer values('" + cus.getCusID() + "','" + cus.getCusNmae() + "','" + cus.getEaddress() + "','" + cus.getNIC() + "'," + cus.getPhone() + ");";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateCustomerToDB(Customer cus) {
        try {
            String query = "UPDATE customer SET cusName = '" + cus.getCusNmae() + "',Eaddress = '" + cus.getEaddress() + "',NIC = '" + cus.getNIC() + "',phone = " + cus.getPhone() + ";";

            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

}
