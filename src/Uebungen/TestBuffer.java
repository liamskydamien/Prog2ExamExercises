package Uebungen;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuffer {
    StinkiRingPuffer<Integer> test = new StinkiRingPuffer<>(16);

    @Test
    void testeAdd(){
        for (int i = 1; i < 17; i++) {
            test.insert(i);
            assertEquals(i,test.size());
        }
        for (Integer integer : test) {
            System.out.print(" " + integer);
        }
    }

    @Test
    void testeRemove(){
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.remove();
        test.insert(4);
        test.insert(5);
        test.insert(6);
        test.insert(7);
        test.remove();
        test.remove();
        test.insert(8);
        test.insert(9);
        test.insert(10);
        test.insert(11);
        test.insert(12);
        test.insert(13);
        test.insert(14);
        test.insert(15);
        test.insert(16);
        test.remove();
        test.remove();
        test.insert(17);
        test.insert(18);
        test.insert(19);
        test.insert(20);
        test.insert(21);
        for (Integer integer : test) {
            System.out.print(" " + integer);
        }
    }
}
