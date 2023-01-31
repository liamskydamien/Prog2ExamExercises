package Uebungen;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StinkiRingPuffer<T> implements Iterable<T>{
    private class RPIterator implements Iterator<T>{
        int current = read;
        @Override
        public boolean hasNext() {
            return current <= pos;
        }

        @Override
        public T next() {
            T retVal = speicher[current % size];
            current++;
            return retVal;
        }
    }
    private T[] speicher;
    private int pos = -1;

    private int read = 0;
    private int size;
    @SuppressWarnings("unchecked")
    public StinkiRingPuffer(int size){
        speicher = (T[])new Object[size];
        this.size = size;
    }

    public void insert(T e){
        if(!isFull()){
            int nextElement = pos +1;
            speicher[nextElement % size] = e;
            pos++;
        }
    }

    public T remove(){
        if(!isEmpty()){
            T nextValue = speicher[read % size];
            read++;
            return nextValue;
        }
        throw new NoSuchElementException();
    }

    public int size(){
        return (pos - read) + 1;
    }

    public boolean isEmpty(){
        return pos < read;
    }

    public boolean isFull(){
        return size() == size;
    }


    @Override
    public Iterator<T> iterator() {
        return new RPIterator();
    }
}
