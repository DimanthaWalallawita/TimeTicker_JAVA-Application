package Controller;

import Models.User;
import java.util.ArrayList;

public class LoginController {
    User obj;
    public ArrayList<User> userDB;
    
    public LoginController() {
        userDB = new ArrayList<>();
        loadLoginInfo();
    }
    final void loadLoginInfo() {
        userDB.add(new User("ADMIN","admin"));
    }
    
    public void addtoLIST(User obj){
        userDB.add(new User(obj.getUserName(),obj.getPassword()));
    }
    
    public User addUser(String username, String password)
    {
        obj = new User(username,password);
        return obj;
    }
    
    public User checkUser(String user)
    {
        for(User u:userDB)
        {
           if(u.getUserName().equals(user))
           {
              return u;               
           }
        }        
        return null;        
    }    
}
