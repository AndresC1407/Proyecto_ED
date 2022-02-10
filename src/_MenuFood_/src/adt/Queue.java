
package adt;


public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    public Queue(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(T value) {
        Node n = new Node(value, null);
        if (tail == null) head = tail = n;
        else {
            tail.next = n;
            tail = n;
        }
        size++;
        System.out.println("Pedido " + value.toString() + "Agregado a la cola");
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Empty!");
        } else {
            T dequeue_value = (T) head.data;
            head = head.next;
            if(head == null) tail = null;
            size --;
            System.out.println("Pedido " + dequeue_value.toString() + "Eliminado de la cola");
            return dequeue_value;
        }

    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
    
    
}
