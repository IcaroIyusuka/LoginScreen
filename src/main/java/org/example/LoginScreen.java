package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Login class its resposible to create "mock" users and simulates a login with the mock users
 * @author Felipe Roberto (SiegDev) RA:226752
 */

public class LoginScreen {

    private static Map<String,String> userDatabase;

    /**
     * LoginScreen not needs a parameters to instance, automaticaly creates a userDatabase and put two registers
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john","password123");
        userDatabase.put("alice","securepass");
    }

    /**
     * Login method, receives a string user and string password and checks if the user exists in the database
     * @param User A string with the username or userlogin
     * @param password A string with the password of the userlogin
     * @return Boolean true if the user and passwords is correctly and false if not
     */
    public boolean login(String User, String password) {

        if (userDatabase.containsKey(User)) {
            String storedPassword = userDatabase.get(User);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * addUser method, receives a string user and string password and put in the userDatabase hashmap to mock users to do tests
     * @param user a string with the username
     * @param password a string with the password of user
     * @Return void return nothing
     */
    public void addUser(String user, String password) {

        userDatabase.put(user,password);
    }
}
