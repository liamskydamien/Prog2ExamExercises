package Uebungen;

import ErsteProbeklausur.SpeicherIF;

public class Main {
 public static void main ( String [] args ) {
         SpeicherIF<Character> p = new RingPuffer<>();
         char [] f = { 'a','b','c','d','e','a','b'};
        for (char c :f ) {
             p. insert ( c);
             System . out . print ( p) ;
             }
         System . out . println () ;
         while (0 < p. size () ) {
             p. remove () ;
             System . out . print (p) ;
             }
         System . out . println () ;
         }
}
