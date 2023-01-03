package ErsteProbeklausur;

public class Main {
    public static void main(String[] args) {
        Paar < Integer > src = new Paar < >(1 ,2) ;
        Paar < Number > dst = new Paar < >(3 ,4) ;
        System.out . println ( " src = "+ src +" ndst ␣ vor ␣ copy = "+ dst );
        Bounds.copy ( src , dst );
        System.out.println ( " dst ␣ nach ␣ copy = "+ dst );

    }
}