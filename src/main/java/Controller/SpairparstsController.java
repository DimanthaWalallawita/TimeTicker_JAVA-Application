package Controller;
import Models.Spairparts;
import DBAccess.SpairparstsAccess;

public class SpairparstsController {
    Spairparts objM;
    SpairparstsAccess objA;
    
    public SpairparstsController(){
        objA = new SpairparstsAccess();
    }
    
    public Spairparts addSpairparts(String Code, String Brand, float Price, String Colour, String Type, int qut){
        objM = new Spairparts(Code,Brand,Price,Colour,Type,qut);
        
        return objM;
    }
    
    public Spairparts updateSpairparts(String Code, String Brand, float Price, String Colour, String Type, int qut){
        objM = new Spairparts(Code,Brand,Price,Colour,Type,qut);
        
        return objM;
    }
    
    public Spairparts deleteSpairparts(String Code, String Brand, float Price, String Colour, String Type, int qut){
        objM = new Spairparts(Code,Brand,Price,Colour,Type,qut);
        
        return objM;
    }
    
    public boolean addSpairparstToDB(Spairparts parts){
        boolean result = objA.addSpairePartsToDB(parts);
        
        return result; 
    }
    
    public boolean updateSpairparstToDB(Spairparts parts){
        boolean result = objA.updateSpairePartsToDB(parts);
        
        return result; 
    }
    
    public boolean deleteSpairparstToDB(Spairparts parts){
        boolean result = objA.deleteSpairePartsToDB(parts);
        
        return result; 
    }
}
