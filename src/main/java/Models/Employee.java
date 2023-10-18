package Models;

public class Employee {
    private String EmpID;
    private String EmpNmae;
    private String address;
    private int age;
    private String password;
    private int phone;
    private String gender;
    private String NIC;

    public Employee(String EmpID, String EmpNmae, String address, int age, String password, int phone, String gender, String NIC) {
        this.EmpID = EmpID;
        this.EmpNmae = EmpNmae;
        this.address = address;
        this.age = age;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.NIC = NIC;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpNmae() {
        return EmpNmae;
    }

    public void setEmpNmae(String EmpNmae) {
        this.EmpNmae = EmpNmae;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
}
