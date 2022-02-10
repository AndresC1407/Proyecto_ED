
package adt;


public class Stack<T> {
    protected Node head;
    
    public Stack(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void push(T value){
        Node n = new Node(value,head);
        head = n;    
    }
    
    public T pop(){
        if(isEmpty()) throw new RuntimeException("Stack Empty!");
        else {
            T popvalue = (T) head.data;
            head = head.next;
            return popvalue;
        }
    }
    
    public T top(){
        if(isEmpty()) throw new RuntimeException("Stack Empty!");
        else{
            return (T) head.data;
        }
            
    }
}
