import java.util.Random;

/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class Speicher1<T> implements SpeicherIF{
    @SuppressWarnings("unchecked")
    T[] speicher = (T[]) new Object[1];

    int counter = 0;

    Random random = new Random();

    int randomValue = random.nextInt(3) + 2;
    int operationCounter = 1;


    private boolean checkIfFull(){
        return (speicher.length - 1) == counter;
    }

    private boolean checkIfToMuch(){
        return (speicher.length / 4 ) >= counter - 1;
    }

    @SuppressWarnings("unchecked")
    private void shrinkPuffer(){
        T[] speicherSec = (T[]) new Object[speicher.length / 2];
        for (int i = 0; i < counter - 1; i++){
            speicherSec[i] = speicher[i];
        }
        speicher = speicherSec;
    }

    @SuppressWarnings("unchecked")
    private void doublePuffer(){
        T[] speicherSec = (T[]) new Object[speicher.length * 2];
        int i = 0;
        for (T element: speicher){
            speicherSec[i] = element;
            i++;
        }
        speicher = speicherSec;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void insert(Object e) {
        if(operationCounter == randomValue){
            randomValue = random.nextInt(3) +2;
            operationCounter = 1;
            return;
        }
        if(checkIfFull()){
            doublePuffer();
            speicher[counter++] = (T) e;
        }
        else {
            speicher[counter++] = (T) e;
        }
        operationCounter++;
    }

    @Override
    public Object remove() {
        if(isEmpty()){
            return null;
        }
        if(checkIfToMuch()){
            shrinkPuffer();
            counter--;
            return null;
        }
        else {
            Object ret = speicher[counter];
            speicher[--counter] = null;
            return ret;
        }
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String toString(){
        String ret = "[";
        for (T element : speicher){
            if(element != null) {
                ret += element + ",";
            }
        }
        ret = ret.substring(0, ret.length() - 1) + "]";
        return ret.length() == 1 ? "[]" : ret;
    }
}
