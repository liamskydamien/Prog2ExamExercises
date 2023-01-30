package Uebungen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinaryTree {

    BinaryTree<Integer> test = new BinaryTree<>();

    @Test
    void testBinaryTree(){
        test.addValue(5);
        assertEquals(1, test.size());
        test.addValue(2);
        assertEquals(2, test.size());
        test.addValue(6);
        test.addValue(1);
        test.addValue(3);
        test.addValue(-2);
        test.addValue(4);
        System.out.println(test.preorder());
        test.delete( 2);
        System.out.println(test.preorder());
    }
}
