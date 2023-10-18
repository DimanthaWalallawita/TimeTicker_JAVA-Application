package Controller;

import DBAccess.SupplierAccess;
import Models.Suppliers;



public class SupplierController {
    Suppliers objM;
    SupplierAccess objA;
    
    public SupplierController(){
        objA = new SupplierAccess();
    }
    
    public Suppliers addSuppliers(String SuppliersID, String BrandName, String SAddress, String SDetails, String SCategory){
        objM = new Suppliers(SuppliersID,BrandName,SAddress,SDetails, SCategory);
        return objM;
    }
    
    public boolean addSuppliersToDB(Suppliers sup){
        boolean result = objA.addSuppliersAccess(sup);
        return result;
    }
    
    public Suppliers updateSuppliers(String SuppliersID, String BrandName, String SAddress, String SDetails, String SCategory){
        objM = new Suppliers(SuppliersID,BrandName,SAddress,SDetails, SCategory);
        return objM;
    }
    
    public boolean updateSuppliersToDB(Suppliers sup){
        boolean result = objA.updateSuppliersAccess(sup);
        return result;
    }
    
    public Suppliers deleteSuppliers(String SuppliersID, String BrandName, String SAddress, String SDetails, String SCategory){
        objM = new Suppliers(SuppliersID,BrandName,SAddress,SDetails, SCategory);
        return objM;
    }
    
    public boolean deleteSuppliersToDB(Suppliers sup){
        boolean result = objA.DeleteSuppliersAccess(sup);
        return result;
    }
}
