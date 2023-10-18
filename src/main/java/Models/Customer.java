package Models;

public class Customer {

    private String CusID;
    private String CusNmae;
    private String Eaddress;
    private String NIC;
    private int phone;

    public Customer(String CusID, String CusNmae, String Eaddress, String NIC, int phone) {
        this.CusID = CusID;
        this.CusNmae = CusNmae;
        this.Eaddress = Eaddress;
        this.NIC = NIC;
        this.phone = phone;

    }

    public String getCusID() {
        return CusID;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }

    public String getCusNmae() {
        return CusNmae;
    }

    public void setCusNmae(String CusNmae) {
        this.CusNmae = CusNmae;
    }

    public String getEaddress() {
        return Eaddress;
    }

    public void setEaddress(String Eaddress) {
        this.Eaddress = Eaddress;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
