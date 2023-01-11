package DritteProbeklausur;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDerAbgaben {
    @Test
    void testeUtil(){
        Collection<Integer> test = new ArrayList<>();
        assertEquals(0, Util.numElementsInCollectionCount(test));
        for (int i = 1; i < 10; i++) {
            test.add(i);
            assertEquals(i, Util.numElementsInCollectionCount(test));
        }
    }

    @Test
    void PushPeekTest(){
        Kellerspeicher<Integer> integers = new Kellerspeicher<>();
        for (int i = 0; i < 10; i++) {
            integers.push(i);
            assertEquals(i,integers.peek());
        }
    }

    @Test
    void popEmptyExceptionTest(){
        Kellerspeicher<Integer> integers = new Kellerspeicher<>();
        assertThrows(ArrayIndexOutOfBoundsException.class, integers::pop);
    }

    @Test
    void testeAllesKopiert(){
        Kellerspeicher<Integer> integers = new Kellerspeicher<>();
        Kellerspeicher<Number> numbers = new Kellerspeicher<>();
        for (int i = 0; i < 10; i++) {
            integers.push(i);
        }
        Util.ksCopy(integers, numbers);
        assertEquals(10,numbers.size());
    }
}
