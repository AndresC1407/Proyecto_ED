
package data;

import java.io.Serializable;

public class Client implements Serializable, Comparable<Client>{
    private String email;
    private String password;
    private static final long serialVersionUID = 6371402L;
    
    public Client(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean equals(Object person){
        Client personObject = (Client) person;
        return ((email.equals(personObject.email)) && (password.equals(personObject.password)));
    }
    
    public int compareTo(Client c){
        return 0;
    }
    
    public String toString(){
        return "Email: " + email;
    }
    
    
}
