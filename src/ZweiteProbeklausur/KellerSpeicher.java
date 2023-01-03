package ZweiteProbeklausur;

public class KellerSpeicher<T> extends DynFeld<T> {

    public KellerSpeicher(int max) {
        super(max);
    }

    public void push(T t) {
        add(t);
    }

    public T pop() {
        return remove();
    }

    public T top() {
        return get(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

}
