
package logic;

import data.Order;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerConnection extends Observable implements Runnable{
    
    public  void startServer(){
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket sc;
            
            System.out.println("Servidor iniciado");
            
            while(true){
                
                //Esperando clientes
                sc = server.accept();

                ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());


                Order ord = (Order) ois.readObject();
                ServerThread st = new ServerThread(ois,ord);
                st.start();
                this.setChanged();
                this.notifyObservers(ord);
                this.clearChanged();
              
                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void run() {
        startServer();
    }
    
}
