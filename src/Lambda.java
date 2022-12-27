/**
 * Lambdafunktion
 * Name:
 * Matrikelnummer:
 */

public class Lambda {
	public static void main(String[] args) {
		p1 = args[0];
		p2 = args[1];
		Paar<> p = new Paar<>(p1,p2);
		int res = p.myCompare(/*IHRE LAMBDAFUNKTION*/);
		System.out.println("Paar("+p1+","+p2+").myCompare(...) = "+res);
	}
}
