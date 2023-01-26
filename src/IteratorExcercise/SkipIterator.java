package IteratorExcercise;

import java.util.Iterator;

public class SkipIterator<T> implements Iterator<T> {
    T[] speicher;
    int current = 0;

    public SkipIterator(T[] speicher){
        this.speicher = speicher;
    }

    @Override
    public boolean hasNext() {
        return current < speicher.length;
    }

    @Override
    public T next() {
        T retValue = speicher[current];
        current = current + 2;
        if(current >= speicher.length && current % 2 == 0){
            current = 1;
        }
        return retValue;
    }
}
