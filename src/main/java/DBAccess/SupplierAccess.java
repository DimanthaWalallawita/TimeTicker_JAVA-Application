package DBAccess;

import DBConnection.DatabaseConnection;
import Models.Suppliers;

public class SupplierAccess {
    private DatabaseConnection singleconnection;

    public SupplierAccess(){
        singleconnection = DatabaseConnection.getSingleInstance() ;
    }

    public boolean addSuppliersAccess(Suppliers sup){
        try{
            String Quary = " insert into suppliers values('"+sup.getSuppliersID()+"','"+sup.getBrandName()
            +"','"+sup.getSAddress()+"','"+sup.getSDetails()+"','"+sup.getSCategory()+"');";

            boolean result = singleconnection.ExecuteQuery(Quary);

            return result;
        }
        catch(Exception e){
            return false;
        }
    }

    public boolean updateSuppliersAccess(Suppliers sup){

        try{
            String Quary = "update suppliers set BrandName = '"+sup.getBrandName()+"' , SAddress = '"+sup.getSAddress()
            +"' , SDetails = '"+sup.getSDetails()+"' , SCategory = '"+sup.getSCategory()+"' WHERE SID = '"+sup.getSuppliersID()+"';";

            boolean result = singleconnection.ExecuteQuery(Quary);

            return result;
        }
        catch(Exception e){
            return false;
        }
    }



    public boolean DeleteSuppliersAccess(Suppliers sup){
        try{
            String Quary = "delete from suppliers where watchID = '"+sup.getSuppliersID()+"'";

            boolean result = singleconnection.ExecuteQuery(Quary);

            return result;
        }
        catch(Exception e){
            return false;
        }
    }
}
