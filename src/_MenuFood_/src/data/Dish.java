
package data;

import java.io.Serializable;

public class Dish implements Comparable<Dish>, Serializable {
    private int id;
    private String type;
    private String name;
    private int price;
    
    public Dish(int id, String type, String name, int price){
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        
    }
    
    public Dish(String name){
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }
    
    public int getPrice(){
        return price;
    }
    
    
    
    
    public String toString(){
        return name + "     " + "$" + price;
    }
    
    public boolean equals(Object dishC){
        Dish dishCObject = (Dish) dishC;
        return type.equals(dishCObject.type);
    }
    
    public int compareTo(Dish dishc){
        int result;
        if(id<dishc.getId()) result = -1;
        else if(id>dishc.getId()) result = 1;
        else result = 0;
        return result;
    }
}
