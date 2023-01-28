package IteratorExcercise;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SpaltenIterator<T> implements Iterator<T> {
    T[][] speicher;
    int z,s = 0;

    public SpaltenIterator(T[][] speicher){
        this.speicher = speicher;
    }
    @Override
    public boolean hasNext() {
        return z < speicher.length & s < speicher[0].length;
    }

    @Override
    public T next() {
        if(hasNext()){
            T retValue = speicher[z++][s];
            if(z >= speicher.length){
                s++;
                z = 0;
            }
            return retValue;
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
