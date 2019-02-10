
package doublelinkedlist;

public class Node<E> {
    E data;
    Node next;
    Node previous;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }
}
