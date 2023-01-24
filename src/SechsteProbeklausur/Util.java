package SechsteProbeklausur;


public class Util {
    public static <T> void printAll(Iterable<T> speicher){
        for (T e : speicher){
            System.out.println(e);
        }
    }
}
