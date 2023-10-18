package DBAccess;
import DBConnection.DatabaseConnection;
import Models.Employee;

public class EmployeeAccess {
    
    private DatabaseConnection singleconnection;
    
    public EmployeeAccess(){
        singleconnection = DatabaseConnection.getSingleInstance();
    } 
    
    public boolean addEmployeeToDB(Employee emp){
        try{
            String query = "Insert Into employee values('"+emp.getEmpID()+"','"+emp.getEmpNmae()+"','"+emp.getAddress()+"',"+emp.getAge()+",'"+emp.getPassword()+"',"+emp.getPhone()+",'"+emp.getGender()+"','"+emp.getNIC()+"');";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean updateEmployeeToDB(Employee emp){
        try{
            String query = "UPDATE employee SET empName = '"+emp.getEmpNmae()+"',address = '"+emp.getAddress()+"',age = "+emp.getAge()+",password = '"+emp.getPassword()+"',phone = "+emp.getPhone()+",gender = '"+emp.getGender()+"',NIC = '"+emp.getNIC()+"' WHERE empID = '"+emp.getEmpID()+"';";
            
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean deleteEmployeeToDB(Employee emp){
        try{
            String query = "DELETE FROM employee WHERE empID = '"+emp.getEmpID()+"';";
            
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
}
