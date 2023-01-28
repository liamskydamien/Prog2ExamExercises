package IteratorExcercise;

import java.util.Iterator;
import java.util.function.IntBinaryOperator;

public class IteratorTest {
    public static void main(String[] args) {
      Integer[][] integers = {{1,2,3},{6,5,4},{7,8,9}};
//        Iterator<Integer> iterator = new SnakeIterator<>(integers);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        Integer[] integers1 = {1,2,3,4,5,6,7,8,9,10};
//        Iterator<Integer> iterator1 = new SkipIterator<>(integers1);
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }

        Iterator<Integer> iterator2= new SpaltenIterator<>(integers);
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
