/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class Speicher2<T> implements SpeicherIF<T>{
    private static class Node<T>{
        private final T value;
        private Node<T> next = null;
        public Node(T e){
            value = e;
        }

        public void setNext(Node<T> n){
            next = n;
        }

        public T getValue(){
            return value;
        }

        public Node<T> getNextNode(){
            return next;
        }

    }

    Node<T> first = null;
    int size = 0;
    int counter = 1;

    @Override
    public void insert(T e) {
        if(counter < 3){
            if(first == null){
                first = new Node<>(e);
            }
            else {
                Node<T> newNode = new Node<>(e);
                newNode.setNext(first);
                first = newNode;
            }
            size++;
            counter++;
        }
        else {
            counter = 1;
        }
    }

    @Override
    public T remove() {
        if(first != null) {
            T retValue = first.getValue();
            first = first.getNextNode();
            size--;
            return retValue;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }
}
