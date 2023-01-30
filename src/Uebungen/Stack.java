package Uebungen;

public class Stack<T> {
    private T[] speicher;
    private int current;
    @SuppressWarnings("unchecked")
    public Stack(int size){
        speicher = (T[]) new Object[size];
    }

    public void push(T e){
        speicher[current++] = e;
    }

    public T pull(){
        return speicher[--current];
    }
}
