/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccess;

import DBConnection.DatabaseConnection;
import Models.expences;

public class expencesAccess {
    private DatabaseConnection singleconnection;
    
    public expencesAccess(){
        singleconnection = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addexpences(expences obj){
        try{
            String query = "Insert Into expenses values('"+obj.getId()+"','"+obj.getBrand()+"',"+obj.getQut()+","+obj.getTotal()+");";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
}
