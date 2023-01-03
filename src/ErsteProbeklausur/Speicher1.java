package ErsteProbeklausur;

import java.util.Random;

/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class Speicher1<T> implements SpeicherIF<T>{
    //Array to store the values
    protected T[] speicher;

    // Counters for inserted Objects and insertions
    protected int counter = 0;
    protected int countOperations = 0;

    //Random Generation of a value between 3 and 5
    protected Random random = new Random();
    protected int start = random.nextInt(3) + 2;

    @SuppressWarnings("unchecked")
    public Speicher1(){
        speicher = (T[]) new Object[1];
    }

    @SuppressWarnings("unchecked")
    public Speicher1(boolean isComparable){
        if(isComparable){
            speicher = (T[]) new Comparable[1];
        }
        else {
            speicher = (T[]) new Object[1];
        }
    }

    @SuppressWarnings("unchecked")
    protected T[] createDoubleArray(){
        if(speicher instanceof Comparable[]){
            return (T[]) new Comparable[speicher.length * 2];
        }
        return (T[]) new Object[speicher.length * 2];
    }

    @SuppressWarnings("unchecked")
    private T[] createSplitArray(){
        if(speicher instanceof Comparable[]){
            return (T[]) new Comparable[speicher.length / 2];
        }
        return (T[]) new Object[speicher.length / 2];
    }

    @Override
    public void insert(T e) {
        if(countOperations == start){
            countOperations = 0;
            start = random.nextInt(3) + 2;
            return;
        }
        if (speicher.length == counter){
            T[] puffer = createDoubleArray();
            for(int i = 0; i < counter; i++){
                puffer[i] = speicher[i];
            }
            speicher = puffer;
        }
        countOperations++;
        speicher[counter++] = e;
    }

    @Override
    public T remove() {
        if(isEmpty()){
            return null;
        }
        T returnValue;
        if(counter - 1 <= (speicher.length / 4)){
            returnValue = speicher[counter - 1];
            T[] puffer = createSplitArray();
            for (int i = 0; i < counter -1; i++){
                puffer[i] = speicher[i];
            }
            speicher = puffer;
            counter--;
        }
        else {
            returnValue = speicher[counter - 1];
            speicher[--counter] = null;
        }
        return returnValue;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }

    public String toString(){
        String returnValue = "[";
        for (T element : speicher){
            if(element != null) {
                returnValue += element + ",";
            }
        }
        return isEmpty()? "[]" : (returnValue.substring(0,returnValue.length() -1) + "]");
    }
}
