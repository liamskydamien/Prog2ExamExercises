package IteratorExcercise;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Integer[][] integers = {{1,2,3},{6,5,4},{7,8,9}};
        Iterator<Integer> iterator = new SnakeIterator<>(integers);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
