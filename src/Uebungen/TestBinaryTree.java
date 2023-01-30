package Uebungen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinaryTree {

    BinaryTree<Integer> test = new BinaryTree<>();

    @Test
    void testBinaryTree(){
        test.addValue(1);
        assertEquals(1, test.size());
        test.addValue(2);
        assertEquals(2, test.size());
        test.addValue(0);
        assertEquals(3, test.size());
        System.out.println(test.preorder());
    }
}
