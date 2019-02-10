
package arraylist;

import iterator.Iterator;

public class CustomArrayListIterator<E> implements Iterator{
    private CustomArrayList<E> customArrayList;
    private int start;
    
    public CustomArrayListIterator(CustomArrayList<E> customArrayList) {
        this.customArrayList = customArrayList;
    }

    @Override
    public boolean fromFirst() {
        if(customArrayList.size() > 0) {
            start = 0;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean fromLast() {
        if(customArrayList.size() > 0) {
            start = customArrayList.size() - 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hasNext() {
        if(start <= customArrayList.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hasPrevious() {
        if(start >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E next() {
        E element = customArrayList.get(start);
        start = start + 1;
        return element;
    }

    @Override
    public E previous() {
        E element = customArrayList.get(start);
        start = start - 1;
        return element;    
    }
}
