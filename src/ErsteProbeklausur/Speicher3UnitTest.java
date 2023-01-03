package ErsteProbeklausur;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Speicher3UnitTest {
    Speicher3<Character> speicher2;
    final char[] liste = {'a', 'b', 'c', 'd', 'e', 'a', 'b'};

    @BeforeEach
    void setup() {
        speicher2 = new Speicher3<>();
    }

    @AfterEach
    void teardown() {
        speicher2 = null;
    }

    @Test
    void insert() {
        for (Character character : liste) {
            speicher2.insert(character);
            System.out.println(speicher2);
        }
    }

    @Test
    void remove() {
        for (Character character : liste) {
            speicher2.insert(character);
            System.out.print(speicher2);
        }
        while (!speicher2.isEmpty()) {
            speicher2.remove();
            System.out.print(speicher2);
        }
    }
}
