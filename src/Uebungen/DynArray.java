package Uebungen;

public class DynArray<T> implements Speicher<T> {
    private T[] speicher;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public DynArray(int size){
        speicher = (T[]) new Object[size];
    }

    @Override
    public void push(T e) {
        if(isEmpty()){
            speicher[0] = e;
        }
        else{
            if(size == speicher.length){
                createDoubleArray();
            }
            speicher[size++] = e;
        }
    }

    @SuppressWarnings("unchecked")
    private void createDoubleArray(){
        T[] newArray = (T[]) new Object[size * 2];
        if (size >= 0) System.arraycopy(speicher, 0, newArray, 0, size);
        speicher = newArray;
    }

    @SuppressWarnings("unchecked")
    private void createHalfArray(){
        T[] newArray = (T[]) new Object[size / 2];
        if (size >= 0) System.arraycopy(speicher, 0, newArray, 0, size);
        speicher = newArray;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }
        else {
            T retValue = speicher[--size];
            if(size <= speicher.length / 4){
                createHalfArray();
            }
            return retValue;
        }
    }

    public T removeFirst(){
        if (isEmpty()){
            return null;
        }
        else {
            T retValue = speicher[0];
            for (int i = 1; i < speicher.length; i++) {
                speicher[i-1] = speicher[i];
            }
            size--;
            if(size <= speicher.length / 4){
                createHalfArray();
            }
            return retValue;
        }
    }

    @Override
    public T get(int i) {
        return speicher[i];
    }

    @Override
    public boolean isEmpty() {
        return speicher[0] == null;
    }
}
