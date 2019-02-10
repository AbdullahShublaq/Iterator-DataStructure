/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

import iterator.Iterator;

/**
 *
 * @author jit
 */
public class CustomDoubleLinkedListIterator<E> implements Iterator {

    private CustomDoubleLinkedList<E> CustomDoubleLinkedList;
    private Node start;

    public CustomDoubleLinkedListIterator(CustomDoubleLinkedList<E> CustomDoubleLinkedList) {
        this.CustomDoubleLinkedList = CustomDoubleLinkedList;
    }

    //start take the first vlaue of DoubleLinkedList (head)
    @Override
    public boolean fromFirst() {
        if (CustomDoubleLinkedList.size() > 0) {
            start = CustomDoubleLinkedList.head();
            return true;
        } else {
            return false;
        }
    }

    //start take the previous vlaue of DoubleLinkedList (tail)
    @Override
    public boolean fromLast() {
        if (CustomDoubleLinkedList.size() > 0) {
            start = CustomDoubleLinkedList.tail();
            return true;
        } else {
            return false;
        }
    }

    //Check if start have next value
    @Override
    public boolean hasNext() {
        return start != null;
    }

    //Check if start have previous value
    @Override
    public boolean hasPrevious() {
        return start != null;
    }

    //find next value of start
    @Override
    public Object next() {
        Node element = start;
        start = start.next;
        return element.data;
    }

    //find previous value of start
    @Override
    public Object previous() {
        Node element = start;
        start = start.previous;
        return element.data;
    }
}
