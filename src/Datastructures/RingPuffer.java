package Datastructures;

public class RingPuffer<T> {
    T[] speicher;
    int size = 0;
    int indexStart, indexEnd = 0;

    @SuppressWarnings("unchecked")
    public RingPuffer(int cap){
        speicher = (T[]) new Object[cap];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T getFirst(){
        return speicher[indexStart];
    }

    public T getLast(){
        return speicher[indexEnd];
    }

    public T get(int index){
        if(index <= indexEnd & index > 0){
            return speicher[index];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void add(T e){
        if(isEmpty()){
            speicher[indexStart] = e;
            size++;
        }
    }
}
