/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import iterator.Iterator;

/**
 *
 * @author jit
 */
public class CustomLinkedListIterator<E> implements Iterator {

    private CustomLinkedList<E> CustomLinkedList;
    private Node start;
    private boolean ForseStop = false;
    private boolean sleep = false;

    public CustomLinkedListIterator(CustomLinkedList<E> CustomLinkedList) {
        this.CustomLinkedList = CustomLinkedList;
    }

    //start take the first vlaue of LinkedList (head)
    @Override
    public boolean fromFirst() {
        if (CustomLinkedList.size() > 0) {
            start = CustomLinkedList.head();
            return true;
        } else {
            return false;
        }
    }

    //start take the first vlaue of LinkedList (tail)
    @Override
    public boolean fromLast() {
        if (CustomLinkedList.size() > 0) {
            start = CustomLinkedList.tail();
            return true;
        } else {
            return false;
        }
    }

    //Check if next have next Value
    //ForseStop are made to stop the hasNext() when start equal tail 
    @Override
    public boolean hasNext() {
        return (!(start.equals(CustomLinkedList.tail())) || (start.equals(CustomLinkedList.tail())) && !ForseStop);
    }

    //Check if next have previous Value
    @Override
    public boolean hasPrevious() {
        return !(start.equals(CustomLinkedList.head()) || (start.equals(CustomLinkedList.head())));
    }

    //Show the next value of start
    @Override
    public Object next() {
        Node Current = start;
        //Check if start equal tail because if we don't do this there have NullPointerEcxeption 
        if (start.equals(CustomLinkedList.tail())) {
            ForseStop = true;
            return CustomLinkedList.tail().data;
        } else {
            start = start.next;
            return Current.data;
        }
    }
    
    //Show the previous value of start
    @Override
    public Object previous() {
        Node element = start;
        Node Current = CustomLinkedList.head();
        Node previous = element;
        //
        //sleep are use to stop while to return start value then while run
        while (!(Current.equals(element)) && sleep) {
            previous = Current;
            Current = Current.next;
        }
        sleep = true;
        start = previous;
        return previous.data;
    }
}
