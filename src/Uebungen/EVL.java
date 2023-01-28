package Uebungen;

public class EVL<T> implements Schlange<T>{
    Knoten start = null;
    private class Knoten{
        private final T value;
        private Knoten next = null;

        public Knoten(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public Knoten getNext() {
            return next;
        }

        public void setNext(Knoten next) {
            this.next = next;
        }
    }
    @Override
    public void push(T e) {
        if(isEmpty()){
            start = new Knoten(e);
        }
        else {
            Knoten current = start;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Knoten(e));
        }
    }

    @Override
    public T pop() {
        T retValue = start.getValue();
        start = start.getNext();
        return retValue;
    }

    @Override
    public T get(int i) {
        Knoten current = start;
        for (int j = 0; i <= i; j++){
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }
}
