
package logic;

import java.io.ObjectOutputStream;


public class ClientThread extends Thread{
    
    private ObjectOutputStream out;

    public ClientThread(ObjectOutputStream out) {
        this.out = out;
    }



    public ObjectOutputStream getOut() {
        return out;
    }

    public void setOut(ObjectOutputStream out) {
        this.out = out;
    }
    
    @Override
    public void run(){
        
    }
}
