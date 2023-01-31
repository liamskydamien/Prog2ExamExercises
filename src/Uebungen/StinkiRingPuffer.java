package Uebungen;

import java.util.NoSuchElementException;

public class StinkiRingPuffer<T> {
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





}
