
package adt;

import java.io.Serializable;

public class OrderedLinkedList<T extends Comparable<T>> implements Serializable{
    
    private Node<T> head;
    
    public OrderedLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean insert(T value) {
        boolean inserted = false;
        Node<T> ptr, prev;
        ptr = head;
        prev = null;

        while (ptr != null && ptr.data.compareTo(value) < 0) {
            prev = ptr;
            ptr = ptr.next;
        }

        if (ptr == null || !(ptr.data.equals(value))) {
            inserted = true;
            Node<T> n = new Node(value, ptr);
            if (prev == null) {
                head = n;
            } else {
                prev.next = n;
            }

        }
        return inserted;
    }
    
    public boolean delete(T value) {
        boolean deleted = false;
        Node<T> ptr, prev;
        ptr = head;
        prev = null;

        while (ptr != null && ptr.data.compareTo(value) < 0) {
            prev = ptr;
            ptr = ptr.next;
        }
        if (ptr == null) {
            return deleted;
        }
        if (ptr.data.equals(value)) {
            deleted = true;
            if (prev == null) {
                head = ptr.next;
            } else {
                prev.next = ptr.next;
            }

        }
        return deleted;
    }

    public Node<T> getHead() {
        return head;
    }
    
    
}
