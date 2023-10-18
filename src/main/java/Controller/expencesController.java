/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBAccess.expencesAccess;
import Models.expences;

public class expencesController {
    expences objI;
    expencesAccess objA;
    
    public expencesController(){
        objA = new expencesAccess();
    }
    
    public expences addexpences(String id, String brand, int qut, float total){
        
        objI = new expences(id,brand,qut,total);
        
        return objI;
    }
    
    public boolean addexpencesDB(expences obj){
        boolean result = objA.addexpences(obj);
        
        return result;
    }
}
