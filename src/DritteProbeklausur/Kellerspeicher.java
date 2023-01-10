package DritteProbeklausur;

import java.util.Vector;

public class Kellerspeicher<T> extends Vector<T> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public T peek(){
        return super.get(size()-1);
    }

    public T pop(){
        return super.remove(size()-1);
    }

    public T push(T e){
        super.add(e);
        return e;
    }
}
