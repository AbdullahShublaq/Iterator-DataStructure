
package linkedlist;

public class CustomLinkedList<E> {
    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;
    
    public void addAtHead(E data) {
        if(size == 0) {
            head = new Node(data);
            tail = head;
        } else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
        size = size + 1;
    }
    
    public void addAtTail(E data) {
        if(size == 0) {
            tail = new Node(data);
            head = tail;
        } else {
            Node newNode = new Node (data);
            tail.next = newNode;
            tail = newNode;
        }
        size = size + 1;
    }
    
    public void addAtIndex(int index, E data) {
        if(index == 0) {
            addAtHead(data);
            size = size + 1;
        } else if(index == size - 1) {
            addAtTail(data);
            size = size + 1;
        } else {
            Node current = head;
            Node previous = null;
            
            for(int i = 0 ; i < size ; i++) {
                if(i == index - 1) {
                    previous = current;
                }
                if(i == index) {
                    Node newNode = new Node(data);
                    previous.next = newNode;
                    newNode.next = current;
                    size = size + 1;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    public void deleteHead() {
        if(size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size = size - 1;
    }
    
    public void deleteTail() {
        if(size == 1) {
            tail = head = null;
            size = size - 1;
        } else {
            Node current = head;
            for(int i = 0 ; i < size ; i++) {
                if(i == size - 2){
                    tail = current;
                    tail.next = null;
                    size = size - 1;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    public void deleteIndex(int index) {
        if(index == 0) {
            deleteHead();
            size = size - 1;
        } else if(index == size - 1){
            deleteTail();
            size = size - 1;
        } else {
            Node current = head;
            Node previous = null;
            for(int i = 0 ; i < size ; i++) {
                if(i == index - 1) {
                    previous = current;
                } 
                else if(i == index) {
                    previous.next = current.next;
                    size = size - 1;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    public E get(int index) {
        if(index == 0) {
            return head.getData();
        } else if(index == size - 1) {
            return tail.getData();
        } else {
            Node<E> current = head;
            
            for(int i = 0 ; i < size ; i++) {
                if(i == index) {
                    break;
                }
                
                current = current.next;
            }
            
            return current.getData();
        }
    }

    public int size() {
        return size;
    }

    public Node<E> head() {
        return head;
    }

    public Node<E> tail() {
        return tail;
    }
    
}
