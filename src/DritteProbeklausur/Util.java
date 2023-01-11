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

    public static <T> void ksCopy(Kellerspeicher<? extends T> ks1, Kellerspeicher<? super T> ks2){
        ks2.addAll(ks1);
    }


}
