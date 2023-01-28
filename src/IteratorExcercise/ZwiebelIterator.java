package IteratorExcercise;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ZwiebelIterator<T> implements Iterator<T> {
    T[][] speicher;

    int z,s =0;

    public ZwiebelIterator(T[][] speicher){
        this.speicher = speicher;
    }

    @Override
    public boolean hasNext() {
        return z < speicher.length && s < speicher[0].length;
    }

    @Override
    public T next() {
        if(hasNext()){
            return null;
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
