package arraylist;
/**
 *
 * @author Abdullah Shublaq
 */
import doublelinkedlist.CustomDoubleLinkedList;
import doublelinkedlist.CustomDoubleLinkedListIterator;
import linkedlist.CustomLinkedList;
import linkedlist.CustomLinkedListIterator;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("/*----------------ArrayList Iterator----------------*/\n");
        
        CustomArrayList<String> arrayList = new CustomArrayList();

        CustomArrayListIterator<String> arrayListIterator = new CustomArrayListIterator(arrayList);

        System.out.println(arrayListIterator.fromFirst());
        System.out.println();

        arrayList.add("Element 1");
        System.out.println(arrayListIterator.fromFirst());
        System.out.println();

        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");
        arrayList.add("Element 5");

        if (arrayListIterator.fromFirst()) {
            while (arrayListIterator.hasNext()) {
                System.out.println(arrayListIterator.next());
            }
        }
        System.out.println();

        if (arrayListIterator.fromLast()) {
            while (arrayListIterator.hasPrevious()) {
                System.out.println(arrayListIterator.previous());
            }
        }

        System.out.println("\n/*----------------LinkedList Iterator----------------*/\n");
        
        CustomLinkedList<String> LinkedList = new CustomLinkedList();

        CustomLinkedListIterator<String> LinkedListIterator = new CustomLinkedListIterator(LinkedList);

        System.out.println(LinkedListIterator.fromFirst());
        System.out.println();

        LinkedList.addAtHead("Element 1");
        System.out.println(LinkedListIterator.fromFirst());
        System.out.println();

        LinkedList.addAtTail("Element 2");
        LinkedList.addAtIndex(1, "Element 3");
        LinkedList.addAtTail("Element 4");
        LinkedList.addAtTail("Element 5");

        if (LinkedListIterator.fromFirst()) {
            while (LinkedListIterator.hasNext()) {
                System.out.println(LinkedListIterator.next());
            }
        }
        System.out.println();

        if (LinkedListIterator.fromLast()) {
            while (LinkedListIterator.hasPrevious()) {
                System.out.println(LinkedListIterator.previous());
            }
        }
        System.out.println("\n/*----------------DoubleLinkedList Iterator----------------*/\n");
        
        CustomDoubleLinkedList<String> DoubleLinkedList = new CustomDoubleLinkedList();

        CustomDoubleLinkedListIterator<String> DoubleLinkedListIterator = new CustomDoubleLinkedListIterator(DoubleLinkedList);

        System.out.println(DoubleLinkedListIterator.fromFirst());
        System.out.println();

        DoubleLinkedList.addAtHead("Element 1");
        System.out.println(LinkedListIterator.fromFirst());
        System.out.println();

        DoubleLinkedList.addAtTail("Element 2");
        DoubleLinkedList.addAtIndex(1, "Element 3");
        DoubleLinkedList.addAtTail("Element 4");
        DoubleLinkedList.addAtTail("Element 5");

        if (DoubleLinkedListIterator.fromFirst()) {
            while (DoubleLinkedListIterator.hasNext()) {
                System.out.println(DoubleLinkedListIterator.next());
            }
        }
        System.out.println();

        if (DoubleLinkedListIterator.fromLast()) {
            while (DoubleLinkedListIterator.hasPrevious()) {
                System.out.println(DoubleLinkedListIterator.previous());
            }
        }
    }
}
