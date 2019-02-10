
package iterator;

public interface Iterator<E> {
    public abstract boolean fromFirst();
    public abstract boolean fromLast();
    public abstract boolean hasNext();
    public abstract boolean hasPrevious();
    public abstract E next();
    public abstract E previous();
}
