package linkedlist;

public class Node<E> {
    E data;
    Node next;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }
}
