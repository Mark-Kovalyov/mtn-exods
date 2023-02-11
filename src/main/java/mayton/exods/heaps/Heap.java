package mayton.exods.heaps;

import java.util.Iterator;

public interface Heap<T extends Comparable> {

    boolean insert(T item);

    int size();

    T peekTopItem();

    T pollTopItem();

    void replaceTopItem(T item);

    Iterator<T> items();

    default void merge(Heap<T> argHeap) {
        merge(argHeap.items());
    }

    default void merge(Iterator<T> comparables) {
        comparables.forEachRemaining(item -> insert(item));
    }

}
