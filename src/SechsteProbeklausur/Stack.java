package SechsteProbeklausur;

public class Stack<T> {

    private T[] speicher;
    private int currentPos = 0;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize){
        speicher = (T[]) new Object[maxSize];
    }

    public void push(T e){
        if(currentPos < speicher.length - 1) {
            currentPos++;
            speicher[currentPos] = e;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public T pull(){
        return speicher[currentPos--];
    }
}
