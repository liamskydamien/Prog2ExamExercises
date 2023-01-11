package DritteProbeklausur;

import java . util . Iterator ;
import java . util . NoSuchElementException ;
public class A2D <T > implements Iterable <T > {
    private class A2DIterator implements Iterator<T>{
        int s, z = 0;

        @Override
        public boolean hasNext() {
            return s < spalten & z < zeilen;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }

            T returnValue = feld[z][s++]; // Speichere Wert an der Stelle z s und erhöhe s um 1
            if(s == spalten){ //Ende der Zeile erreicht
                z = z + 2; // erhöhe z um 2
                s = 0; //fange von vorne an
                if (z >= feld.length & z % 2 == 0){ // Ende der geraden Zeilen erreicht
                    z = 1;
                }
            }
            return returnValue;
        }
    }
    int zeilen , spalten ; // Anzahl der Zeilen und Spalten
    T [][] feld ; // das Feld
    // Konstruktor
    @SuppressWarnings (" unchecked " )
    public A2D ( int z , int s) {
        zeilen = z;
        spalten = s;
        feld = ( T [][]) new Object [ zeilen ][ spalten ];
    }

    public A2D(int z, int s, T[][] array){
        zeilen = z;
        spalten = s;
        feld = array;
    }
    // element hinzuf ü gen an der Position z ,s
    public void insert (T elem , int z , int s ) {
        feld [z ][ s ] = elem ;
    }
    public T get ( int z , int s ) {
        return feld [ z ][ s ];
    }
    @Override
    public Iterator <T > iterator () {
        return new A2DIterator();
    }
}