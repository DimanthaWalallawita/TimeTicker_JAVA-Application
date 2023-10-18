package Testing;

import org.junit.jupiter.api.*;
import Controller.LoginController;
import Models.User;

public class LoginUnitTest {
    static LoginController loginObj;
    User actualValue;
    
    @BeforeAll
    public static void CreateLogin()
    {
        loginObj=new LoginController();
    }
    @BeforeEach
    public void AssignValues()
    {
        actualValue = loginObj.checkUser("joy");
    }
    @Test
    public void TestLogin()
    {
        Assertions.assertNotNull(actualValue);
    }
    @AfterEach
    public void CleanValues()
    {
        actualValue=null;
    }
    @AfterAll
    public static void DeleteLogin()
    {
        loginObj=null;
    }  
}
