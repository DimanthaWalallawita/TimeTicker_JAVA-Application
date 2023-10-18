package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {
    private final String URL = "jdbc:mysql://localhost:3306/finalproject";
    private final String Uname = "root";
    private final String password = "";
    private static DatabaseConnection instance;
    private Connection con;
    
    public DatabaseConnection(){  //Create sql Connection
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,Uname,password);
            System.out.println("Connected Successfully");
        }
        catch(SQLException ex){
            System.out.println("Database conection error "+ex.getMessage());
        }
        
        catch(ClassNotFoundException e){
            System.out.println("Driver class not found "+e.getMessage());
        }
    }
    
    public static DatabaseConnection getSingleInstance(){
        try{
            if(instance == null){
                instance = new DatabaseConnection();
            }
            else if(instance.con.isClosed()){
                instance = new DatabaseConnection();
            }
            else{
                return instance;
            }
        }
        catch(SQLException ex){
            System.out.println("Database Connection error "+ex.getMessage());
            return null;
        }
        
        return instance;
    }
    
    public boolean ExecuteQuery(String sqlQ){
        try{
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0;
        }
        catch(SQLException ex){
            System.out.println("SQL Error "+ex.getMessage());
            return false;
        }
    }
    
    public ResultSet ShowExecuteQuery(String sqlQ){
        try{
            Statement st = con.createStatement();
            ResultSet rs;
            
            rs = st.executeQuery(sqlQ);
            
            return rs;
        }
        catch(SQLException ex){
            System.out.println("SQL Error "+ex.getMessage());
            return null;
        }
    }
}
