
package logic;

import data.Order;
import java.io.ObjectInputStream;

public class ServerThread extends Thread {
    private ObjectInputStream in;
    private Order ord;

    public ServerThread(ObjectInputStream in, Order ord) {
        this.in = in;
        this.ord = ord;
    }

    public ObjectInputStream getIn() {
        return in;
    }

    public void setIn(ObjectInputStream in) {
        this.in = in;
    }

   

    public Order getDish() {
        return ord;
    }

    public void setDish(Order dish) {
        this.ord = dish;
    }
    
    @Override
    public void run(){
        
    }
}
