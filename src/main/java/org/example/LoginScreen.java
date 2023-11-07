package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * A classe login é reponsavel por criar usuários falsos, para uma simulação de login
 * @author Icaro Iyusuka RA:200426
 */

public class LoginScreen {

    private static Map<String,String> userDatabase;

    /**
     * O LoginScreen não precisa de parametro para instanciar, e cria o userDatabase e gera dois registradores.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john","password123");
        userDatabase.put("alice","securepass");
    }

    /**
     * O metodo login recebe e verifica a string user e a string senha, para ver se existem no banco de dados
     * @param User é string usada para nome do usuário
     * @param password é a string para a senha do usuário
     * @return Boolean é para ver se é verdadeiro ou falso, um meio de validar os dados recebidos
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
     * O metodo addUser, recebe as string user, como a string password e coloca no hashmap userDatabase para simular usuarios para testes
     * @param user é a string para o usuario
     * @param password é a string para a senha do usuario
     * @Return void não retorna nada
     */
    public void addUser(String user, String password) {

        userDatabase.put(user,password);
    }
}
