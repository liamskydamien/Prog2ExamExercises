package Uebungen;

import ErsteProbeklausur.SpeicherIF;

public class RingPuffer<T> implements SpeicherIF<T> {

    private int size = 0;
    private int start = 0;

    @SuppressWarnings("unchecked")
    private T[] ringpuffer = (T[]) new Object[10];

    @Override
    public void insert(T e) {
        ringpuffer[size % 10] = e;
        size++;
    }

    @Override
    public T remove() {
        T retValue = ringpuffer[size % 10];
        size--;
        return retValue;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size - start;
    }

    @Override
    public String toString(){
        String ret = "[";
        int current = start;
        while (current <= size){
            T val = ringpuffer[current % 10];
            if(val != null) {
                ret += ringpuffer[current % 10] + ",";
            }
            current++;
        }
        return ret + "]";
    }
}
