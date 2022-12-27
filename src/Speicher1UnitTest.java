import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Speicher1UnitTest {
    final char[] testArray = {'a', 'b', 'c', 'd', 'e', 'a', 'b'};
    Speicher1<Character> testSpeicher;

    @BeforeEach
    void setup(){
        testSpeicher = new Speicher1<>();
    }

    @Test
    void fill(){
        int counter = 0;
        for(Character character : testArray){
            testSpeicher.insert(character);
            assertTrue(testSpeicher.size() == ++counter);
            System.out.println(testSpeicher);
        }
    }

    @Test
    void remove(){
        int counter = 0;
        for(Character character : testArray){
            testSpeicher.insert(character);
            //assertTrue(testSpeicher.size() == ++counter);
            System.out.println(testSpeicher);
        }
        for(Character character : testArray){
            testSpeicher.remove();
            //assertTrue(testSpeicher.size() == --counter);
            System.out.println(testSpeicher);
        }
    }

    @Test
    void sorted(){
        testSpeicher = new SortierterSpeicher<Character>();
        for(Character character : testArray){
            testSpeicher.insert(character);
            //assertTrue(testSpeicher.size() == ++counter);
            System.out.println(testSpeicher);
        }
        for(Character character : testArray){
            testSpeicher.remove();
            //assertTrue(testSpeicher.size() == --counter);
            System.out.println(testSpeicher);
        }
    }
}
