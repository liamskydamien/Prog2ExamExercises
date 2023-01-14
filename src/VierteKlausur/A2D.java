package VierteKlausur;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class A2D <T > implements Iterable <T > {
    private class A2DIterator implements Iterator<T>{

        int s,z = 0;
        boolean switched = false;

        @Override
        public boolean hasNext() {
            return z < zeilen && s < spalten; //Prüft ob interne Zähler gleich den Maßen sind.
        }

        @Override
        public T next() {
            if(hasNext()){
                T returnValue = feld[z][s]; //Speichere Wert an der Position z s
                s++; //erhöhe s
                if(s == spalten){ //wenn es am Ende ist
                    z = z + 2; //erhöhe z um 2, somit bleibt z gerade beziehungsweise ungerade
                    if(z >= zeilen & !switched){ //Wenn Z am Ende angekommen ist sowie noch nicht auf gerade gewechselt
                        z = 1; //setze z auf 1
                        switched = true;
                    }
                    s = 0; //Spalten wieder auf 0
                }
                return returnValue;
            }
            else {
                throw new NoSuchElementException();
            }
        }
    }
    int zeilen, spalten; // Anzahl der Zeilen und Spalten
    T[][] feld; // das Feld

    // Konstruktor
    @SuppressWarnings(" unchecked ")
    public A2D(int z, int s) {
        zeilen = z;
        spalten = s;
        feld = (T[][]) new Object[zeilen][spalten];
    }

    public A2D(int z, int s, T[][] array){
        zeilen = z;
        spalten = s;
        feld = array;
    }

    // element hinzuf ü gen an der Position z ,s
    public void insert(T elem, int z, int s) {
        feld[z][s] = elem;
    }

    public T get(int z, int s) {
        return feld[z][s];
    }

    @Override
    public Iterator<T> iterator() {
// TODO Auto - generated method stub
        return new A2DIterator();
    }
}