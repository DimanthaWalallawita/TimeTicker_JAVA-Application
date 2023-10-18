package Controller;

import DBAccess.incomeAccess;
import Models.income;


public class incomeController {
    income objI;
    incomeAccess objA;
    
    public incomeController(){
        objA = new incomeAccess();
    }
    
    public income addIncome(String id, String brand, int qut, float total){
        
        objI = new income(id,brand,qut,total);
        
        return objI;
    }
    
    public boolean addincomeDB(income obj){
        boolean result = objA.addIncome(obj);
        
        return result;
    }
}
