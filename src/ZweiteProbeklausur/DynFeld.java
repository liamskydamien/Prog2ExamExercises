package ZweiteProbeklausur;

public class DynFeld<T> {
    private T[] feld;
    private int anzahl;
    private int max;

    @SuppressWarnings("unchecked")
    public DynFeld(int max) {
        this.max = max;
        feld = (T[]) new Object[max];
        anzahl = 0;
    }

    @SuppressWarnings("unchecked")
    public void add(T t) {
        if(anzahl == max) {
            max *= 2;
            T[] tmp = (T[]) new Object[max];
            if (anzahl >= 0) System.arraycopy(feld, 0, tmp, 0, anzahl);
            feld = tmp;
        }
        feld[anzahl++] = t;
    }

    @SuppressWarnings("unchecked")
    public T remove(){
        if(anzahl != 0) {
            if (anzahl <= max / 4) {
                max /= 2;
                T[] tmp = (T[]) new Object[max];
                if (anzahl >= 0) System.arraycopy(feld, 0, tmp, 0, anzahl);
                feld = tmp;
            } else {
                T tmp = feld[anzahl - 1];
                feld[anzahl - 1] = null;
                anzahl--;
                return tmp;
            }
        }
        return null;
    }

    public T get(int i) {
        return feld[i];
    }

    public int size() {
        return anzahl;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < anzahl; i++) {
            s.append(feld[i]).append(" ");
        }
        return s.toString();
    }
}
