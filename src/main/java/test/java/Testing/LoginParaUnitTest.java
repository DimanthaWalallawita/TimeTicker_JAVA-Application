package Testing;
import Controller.*;
import Controller.LoginController;
import Models.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LoginParaUnitTest {

    static LoginController loginObj;
    User actualValue;

    @BeforeAll
    public static void CreateLogin() {
        loginObj = new LoginController();
    }

    @ParameterizedTest
    
    @ValueSource(strings = {"Sadun", "Nimal", "Aamal"})
    
    public void TestUserLogins(String usertext) {
        actualValue = loginObj.checkUser(usertext);
        Assertions.assertNotNull(actualValue);
    }

    @AfterEach
    public void CleanValues() {
        actualValue = null;
    }

    @AfterAll
    public static void DeleteLogin() {
        loginObj = null;
    }
}
