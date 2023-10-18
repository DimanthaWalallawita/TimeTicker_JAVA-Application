package DBAccess;
import DBConnection.DatabaseConnection;
import Models.Spairparts;

public class SpairparstsAccess {
    private DatabaseConnection singleconnection;
    
    public SpairparstsAccess(){
        singleconnection = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addSpairePartsToDB(Spairparts obj){
        try{
            String query = "Insert into spareparts values ('"+obj.getCode()+"','"+obj.getBrand()+"',"+obj.getPrice()+",'"+obj.getColour()+"','"+obj.getType()+"',"+obj.getQuantity()+");";
            
            boolean result = singleconnection.ExecuteQuery(query);
            
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean updateSpairePartsToDB(Spairparts obj){
        try{
            String query = "Update spareparts Set BrandName = '"+obj.getBrand()+"', Price = "+obj.getPrice()+", Colour = '"+obj.getColour()+"', Type = '"+obj.getType()+"', Quantity = "+obj.getQuantity()+" WHERE code = '"+obj.getCode()+"';";
            
            boolean result = singleconnection.ExecuteQuery(query);
            
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean deleteSpairePartsToDB(Spairparts obj){
        try{
            String query = "Delete From spareparts Where code = '"+obj.getCode()+"';";
            
            boolean result = singleconnection.ExecuteQuery(query);
            
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
}
