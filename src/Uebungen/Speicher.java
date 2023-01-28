package Uebungen;

public interface Speicher<T> {
    void push(T e);
    T pop();
    T get(int i);
    boolean isEmpty();
}
