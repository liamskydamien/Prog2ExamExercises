import java.util.Iterator;

/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class IterierbarerSpeicher<T> extends Speicher1<T> implements Iterable<T>{
    private class IteratorSpeicher<E extends T> implements Iterator<T>{
        int position = 0;
        @Override
        public boolean hasNext() {
            return speicher[position] != null;
        }

        @Override
        public T next() {
            return speicher[position++];
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new IteratorSpeicher<T>();
    }
}
