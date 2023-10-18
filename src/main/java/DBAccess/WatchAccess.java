package DBAccess;
import Models.Watch;
import DBConnection.DatabaseConnection;


public class WatchAccess {
    private DatabaseConnection singleconnection;
    
    public WatchAccess(){
        singleconnection = DatabaseConnection.getSingleInstance();
    } 
    
    public boolean addWatchToDB(Watch obj){
        try{
            String query = "Insert Into watch values('"+obj.getWatchID()+"','"+obj.getBrandName()+"',"+obj.getPrice()+",'"+obj.getColour()+"','"+obj.getCategory()+"',"+obj.getQuantity()+");";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean updateWatchToDB(Watch obj){
        try{
            String query = "UPDATE watch SET BrandName = '"+obj.getBrandName()+"', Price = '"+obj.getPrice()+"', Colour = '"+obj.getColour()+"', Category = '"+obj.getCategory()+"', Quantity = "+obj.getQuantity()+" WHERE watchID = '"+obj.getWatchID()+"';";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean deleteWatchToDB(Watch obj){
        try{
            String query = "DELETE FROM watch WHERE watchID = "+obj.getWatchID()+"'";
            boolean result = singleconnection.ExecuteQuery(query);
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
}
