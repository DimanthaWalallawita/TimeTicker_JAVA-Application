package DBAccess;

import DBConnection.DatabaseConnection;
import Models.income;


public class incomeAccess {
    private DatabaseConnection singleconnection;
    
    public incomeAccess(){
        singleconnection = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addIncome(income obj){
        try{
            String query = "Insert Into income values('"+obj.getId()+"','"+obj.getBrand()+"',"+obj.getQut()+","+obj.getTotal()+");";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
}


