
package logic;

import data.Order;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientConnection implements Runnable {
    
    private Order ord;
    
    public ClientConnection(Order ord){
        this.ord = ord;
    }
    public void startClient(){
        try{
            Socket sc = new Socket("127.0.0.1",5000);
            ObjectOutputStream oos = new ObjectOutputStream(sc.getOutputStream());
            
            oos.writeObject(this.ord);
            ClientThread ct = new ClientThread(oos);
            ct.start();
            ct.join();
        }catch(IOException ex){} catch (InterruptedException ex) {
            Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run() {
        startClient();
    }
    
}
