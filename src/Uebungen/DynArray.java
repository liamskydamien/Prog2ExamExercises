package Uebungen;

public class DynArray<T> implements Speicher<T> {
    private T[] speicher;

    @SuppressWarnings("unchecked")
    public DynArray(int size){
        speicher = (T[]) new Object[size];
    }

    @Override
    public void push(T e) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
