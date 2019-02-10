
package arraylist;

import java.util.Arrays;

public class CustomArrayList<E> {
    private int size = 0;
    private Object[] elements;
    
    public CustomArrayList(){
        elements = new Object[1];
    }
    
    public int size(){
        return size;
    }
    
    public void add(E object){
        if(size == 0) {
            elements[0] = object;
            size = size + 1;
        } else {
            size = size + 1;
            elements = Arrays.copyOf(elements, size);
            elements[size - 1] = object;
        }
    }
    
    public void remove(int index) {
        int j = index + 1;
        
        for(int i = index ; j < size ; i++) {
            elements[i] = elements[j];
            j = j + 1;
        }
        
        size = size - 1;
        elements = Arrays.copyOf(elements, size);
    }
    
    public E get(int index) {
        return (E) elements[index];
    }
    
    public boolean contains(E object) {
        if(object instanceof Comparable) {
            for(int i = 0 ; i < size ; i++) {
                if(((Comparable) object).compareTo(elements[i]) == 0){
                    return true;
                }
            }
        } else {
            for(int i = 0 ; i < size ; i++){
                if(elements[i].equals(object)){
                    return true;
                }
            }
        }
        
        return false;
    }
}
