package DritteProbeklausur;

import java.util.Collection;

public class Util {
    public static <T> int numElementsInCollectionCount(Collection<T> collection){
        int counter = 0;
        for (T element:
             collection) {
            counter++;
        }
        return counter;
    }
}
