
package adt;

public class OrderedLinkedList<T extends Comparable<T>> {
    
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
}
