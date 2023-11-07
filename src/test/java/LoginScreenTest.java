import static  org.junit.Assert.*;

import org.example.LoginScreen;
import org.junit.Test;
public class LoginScreenTest {
    @Test
    public void  testSuccessfullogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("john","password123"));
    }

    @Test
    public void testFailedLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("John","password1234"));
    }

    @Test
    public void testAddUser(){
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("teste2","12345");
        assertTrue(loginScreen.login("teste2","12345"));
    }
}
