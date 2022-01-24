
package adt;

import java.io.Serializable;

public class LinkedList<T> implements Serializable {
     
    private Node head;
    private Node tail;
    
    public LinkedList(){
        head = null;
        tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
       
    public void pushBack(T data){
        Node<T> n = new Node<T>(data,null);
        if(isEmpty()) head = tail = n;
        else{
            tail.next = n;
            tail = n;
        }
        
    }
    
    public T topBack(){
        if(isEmpty()) throw new RuntimeException("List Empty!");
        return (T) tail.data;
    }
    
    public boolean find(T data){
        Node temp = head;
        while(temp != null){
            if(data.equals(temp.data)) return true;
            temp = temp.next;
        }
        return false;
    }

    public Node getHead() {
        return head;
    }
    
    
    
    public void showFullList() {
        int index = 0;
        if (isEmpty()) {
            System.out.println("Lista vacia");

        } else {
            Node temp;
            temp = head;
            while (temp != null) {
                System.out.print(temp.data.toString() + " \n");
                temp = temp.next;
                index++;
            }
        }
    }
}

