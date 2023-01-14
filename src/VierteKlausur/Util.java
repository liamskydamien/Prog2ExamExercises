package VierteKlausur;

import java.util.Collection;

public class Util {

    public static <T> int numElementsInCollection(Collection<T> collection, T data){
        int counter = 0; //Um Anzahl der Element die = data sind zu zählen
        for (T element : collection){ //Um durch die Collection zu iterieren
            if(element.equals(data)){ //Vergleich vom akteullen Element und data
                counter++; //erhöht zähler
            }
        }
        return counter;
    }

    public static <T> void sCopy(Schlange<? extends T> s1, Schlange<? super T> s2){
        for (T e : s1){
            s2.insert(e);
        }
    }
}
