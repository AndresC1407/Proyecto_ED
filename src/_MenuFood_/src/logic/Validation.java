
package logic;

import adt.LinkedList;
import data.Client;

public class Validation {
    
    //Register Validations
    public static boolean validateEmail(String email){
        return email.contains("@");
    }
    
    public static boolean validatePasswords(String password, String passwordr){
        return (password.equals(passwordr)) && !(password.equals(""));
    }
    
    
    //Login Validations
    public static boolean validateLogin(String email, String password){
        MyFile f = new MyFile();
        Client c = new Client(email,password);
        LinkedList<Client> clients;
        clients = f.readClients();
        return clients.find(c);
        
    }
    

}
