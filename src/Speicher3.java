/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class Speicher3<T> implements SpeicherIF<T>{

    @SuppressWarnings("unchecked")
    T[] speicher = (T[]) new Object[10];
    int position = 0;
    int counter = 0;

    @Override
    public void insert(T e) {
        if(position < 9) {
            speicher[++position] = e;
        }
        else {
            speicher[0] = e;
            position = 0;
        }
        counter++;
    }

    @Override
    public T remove() {
        T retValue = speicher[position];
        speicher[position] = null;
        if(position == 0){
            position = 9;
        }
        else {
            position--;
        }
        counter--;
        return retValue;
    }

    @Override
    public boolean isEmpty() {
        return speicher[position] == null;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
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
