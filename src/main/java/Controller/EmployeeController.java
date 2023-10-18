package Controller;
import Models.Employee;
import DBAccess.EmployeeAccess;

public class EmployeeController {
    Employee obj;
    EmployeeAccess objA;
    
    public EmployeeController(){
        objA = new EmployeeAccess();
    }
    
    public Employee addEmployee(String EmpID, String EmpNmae, String address, int age, String password, int phone, String gender, String NIC)
    {
        obj = new Employee(EmpID,EmpNmae,address,age,password,phone,gender,NIC);
        return obj;
    }
    
    public Employee updateEmployee(String EmpID, String EmpNmae, String address, int age, String password, int phone, String gender, String NIC)
    {
        obj = new Employee(EmpID,EmpNmae,address,age,password,phone,gender,NIC);
        return obj;
    }
    
    public Employee deleteEmployee(String EmpID, String EmpNmae, String address, int age, String password, int phone, String gender, String NIC)
    {
        obj = new Employee(EmpID,EmpNmae,address,age,password,phone,gender,NIC);
        return obj;
    }
    
    public boolean addEmployeeToDB(Employee emp){
        boolean result = objA.addEmployeeToDB(emp);
        return result;
    }
    
    public boolean updateEmployeeToDB(Employee emp){
        boolean result = objA.updateEmployeeToDB(emp);
        return result;
    }
    
    public boolean deleteEmployeeToDB(Employee emp){
        boolean result = objA.deleteEmployeeToDB(emp);
        return result;
    }
    
}
