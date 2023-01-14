package VierteKlausur;

import java.util.Vector;

public class Schlange<T> extends Vector<T> {
    // isEmpty bereits in Vector definiert
    public T peek(){
        return super.get(0); //Gibt erstes Element der Schlange aus
        //Exception wird von Vector geworfen
    }

    public T remove(){
        return super.remove(0); //Löscht erstes Element der Schlange und gibt es aus
        //Exception wird von Vector geworfen
    }

    public void insert(T e){
        super.add(e);
    }
}
