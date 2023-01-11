package DritteProbeklausur;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

    @Test
    void testeDurchlauf(){
        Integer[][] integers = {{1,2,3},{4,5,6},{7,8,9}};
        A2D<Integer> a2d = new A2D<>(3,3, integers);

        for (int e : a2d){
            System.out.println(e);
        }

    }
}
