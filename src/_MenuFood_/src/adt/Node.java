
package adt;

import java.io.Serializable;


public class Node<T> implements Serializable{
    public T data;
    public Node next;
        
        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
}
