package FuenfteKlausur;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class KombiIterator<E ,T extends Iterator<E>> implements Iterator<E> {

    T i1, i2;

    public KombiIterator(T i1, T i2){
        this.i1 = i1;
        this.i2 = i2;
    }

    @Override
    public boolean hasNext() {
        return i1.hasNext() || i2.hasNext();
    }

    @Override
    public E next() {
        if(hasNext()){
            if(i1.hasNext()){
                return i1.next();
            }
            else {
                return i2.next();
            }
        }
       throw new NoSuchElementException();
    }
}
