
package data;

import adt.LinkedList;
import java.io.Serializable;

public class Order implements Serializable {
    
    private int id;
    private LinkedList<Dish> dishes;
    private Client cl;
    
    public Order(LinkedList<Dish> dishes, Client cl){
        this.cl = cl;
        this.id = generateValidID();
        this.dishes = dishes;
        
    }

    public int getId() {
        return id;
    }

    public LinkedList<Dish> getDishes() {
        return dishes;
    }

    public Client getCl() {
        return cl;
    }
    
    public String toString(){
        return "Orden ID: " + id;
    }
    
    private int generateValidID(){
        String email = cl.getEmail();
        int id = 0;
        char ch;
        for(int i = 0; i < email.length(); i++){
            ch = email.charAt(i);
            id += (int) ch;
        }
        
        return id;
    }
}
