package logic;

import adt.LinkedList;
import adt.OrderedLinkedList;
import data.Client;
import data.Dish;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFile {

    private final String CLIENT_PATH = "src/files/Clients.dat";
    private  final String DISH_PATH = "src/files/Dishes.csv";
    File f = new File(CLIENT_PATH);

    public void saveClient(Client c) {
        ObjectOutputStream oos;
        
        try{
            if (f.length() == 0) {
            oos = new ObjectOutputStream(new FileOutputStream(f));

        } else {
            oos = new MyObjectOutputStream(new FileOutputStream(f, true));
        }

        oos.writeObject(c);
        }catch(IOException ex){
            
        }

    }

    public LinkedList readClients() {
        LinkedList<Client> clients = new LinkedList<Client>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            Client c = null;
            while (true) {
                c = (Client) ois.readObject();
                if(c != null){
                    clients.pushBack(c);
                }
            }
        } catch (EOFException ex) {
            System.out.println("Se leyeron todos los clientes!");
        } catch (IOException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clients;
    }
    
    public LinkedList readDishes(){
     
        //Variables para guardar el Plato
        int id;
        String type;
        String name;
        int price;
        String line = "";
        LinkedList<Dish> dishes = new LinkedList<Dish>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(DISH_PATH));
            
            line = br.readLine();
            while(line != null){
                String[] data = line.split(",");
                id = Integer.parseInt(data[0]);
                type = data[1];
                name = data[2];
                price = Integer.parseInt(data[3]);
                Dish d = new Dish(id,type,name,price);
                dishes.pushBack(d);
                line = br.readLine();
            }
          
            
            
         br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            
        }
        
        return dishes;
    }

}
