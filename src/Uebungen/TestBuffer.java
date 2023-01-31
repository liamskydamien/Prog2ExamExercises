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
            System.out.print(integer);
        }
    }
}
