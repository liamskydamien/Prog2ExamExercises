package ErsteProbeklausur;

public class Main {
    public static void main(String[] args) {
//        Paar < Integer > src = new Paar < >(1 ,2) ;
//        Paar < Number > dst = new Paar < >(3 ,4) ;
//        System.out . println ( " src = "+ src +" ndst ␣ vor ␣ copy = "+ dst );
//        Bounds.copy ( src , dst );
//        System.out.println ( " dst ␣ nach ␣ copy = "+ dst );

        Integer [] iFeld = {1 ,2 ,3};
        Number [] nFeld = {1.1 , 2.2 , 3.3};
        Speicher1 < Integer > src = new Speicher1 < >() ;
        for ( int i: iFeld ) src . insert ( i) ;
        Speicher1 < Number > dst = new Speicher1 < >() ;
        for ( Number n : nFeld ) dst . insert (n) ;
        System . out . println ( " src = "+ src +" ndst ␣ vor ␣ copy = "+ dst );

        Bounds . copy(src,dst);
        System . out . println ( " src ␣ nach ␣ copy = "+ src );
        System . out . println ( " dst ␣ nach ␣ copy = "+ dst );
    }
}