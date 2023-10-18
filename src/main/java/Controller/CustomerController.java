package Controller;

import Models.Customer;
import DBAccess.CustomerAccess;
import javax.swing.JTextField;

public class CustomerController {

    Customer obj;
    CustomerAccess objA;

    public CustomerController() {
        objA = new CustomerAccess();
    }

    public Customer addCustomer(String CusID, String CusNmae, String Eaddress, String NIC, int phone) {
        obj = new Customer(CusID, CusNmae, Eaddress, NIC, phone);
        return obj;
    }

    public Customer updateCustomer(String CusID, String CusNmae, String Eaddress, String NIC, int phone) {
        obj = new Customer(CusID, CusNmae, Eaddress, NIC, phone);
        return obj;
    }

    public boolean addCustomerToDB(Customer cus) {
        boolean result = objA.addCustomerToDB(cus);
        return result;
    }

    public boolean updateCustomerToDB(Customer cus) {
        boolean result = objA.updateCustomerToDB(cus);
        return result;
    }

}
