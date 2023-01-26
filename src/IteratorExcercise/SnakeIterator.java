package IteratorExcercise;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeIterator<T> implements Iterator<T> {
    private int row, column = 0;
    private T[] [] speicher;
    public SnakeIterator(T[][] speicher){
        this.speicher = speicher;
    }

    @Override
    public boolean hasNext() {
        return row < speicher.length && column < speicher[0].length;
    }

    @Override
    public T next() {
        if (hasNext()){
            T retValue;
            if(row % 2 == 0) {
                retValue = speicher[row][column++];
                if (column >= speicher[0].length) {
                    column--;
                    row++;
                }
            }
            else {
                retValue = speicher[row][column--];
                if (column < 0){
                    column++;
                    row++;
                }
            }
            return retValue;
        }
        else {
            throw new NoSuchElementException();
        }
    }

}
