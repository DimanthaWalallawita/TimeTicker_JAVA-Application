package Controller;
import Models.Watch;
import DBAccess.WatchAccess;

public class WatchController {
    
    Watch objW;
    WatchAccess objA;
    
    public WatchController(){
        objA = new WatchAccess();
    }
    
    public Watch addWatch(String WatchID, String BrandName, float Price, String Colour, String Category, int qut){
        
        objW = new Watch(WatchID,BrandName,Price,Colour, Category,qut);
        
        return objW;
    }
    
    public Watch updateWatch(String WatchID, String BrandName, float Price, String Colour, String Category, int qut){
        
        objW = new Watch(WatchID,BrandName,Price,Colour, Category,qut);
        
        return objW;
    }
    
    public Watch deleteWatch(String WatchID, String BrandName, float Price, String Colour, String Category, int qut){
        
        objW = new Watch(WatchID,BrandName,Price,Colour, Category,qut);
        
        return objW;
    }
    
    public boolean addWatchToDB(Watch obj){
        boolean result = objA.addWatchToDB(obj);
        
        return result;
    }
    
    public boolean updateWatchToDB(Watch obj){
        boolean result = objA.updateWatchToDB(obj);
        
        return result;
    }
    
    public boolean deleteWatchToDB(Watch obj){
        boolean result = objA.deleteWatchToDB(obj);
        
        return result;
    }
}
