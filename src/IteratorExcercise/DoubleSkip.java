package IteratorExcercise;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleSkip implements Iterator<Integer> {

    Integer[][] speicher;
    int z,s = 0;

    public DoubleSkip(Integer[][] speicher) {
        this.speicher = speicher;
    }

    @Override
    public boolean hasNext() {
        return z < speicher.length & s < speicher[0].length;
    }

    @Override
    public Integer next() {
        if(hasNext()){
            Integer retValue = speicher[z][s++];
            if(s >= speicher[0].length){
                s =0;
                z =  z +2;
                if(z >= speicher.length & z % 2 == 0){
                    z = 1;
                }
            }
            return retValue;
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
