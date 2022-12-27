import java.util.Comparator;

/**
 * Lambdafunktion
 * Name:
 * Matrikelnummer:
 */

public class Lambda {
	public static void main(String[] args) {
		Double[] doubles = {1.1,2.0};
		Double[] doubles2 = {2.0,2.0};
		Double[] doubles3 = {2.1,2.0};
		main(doubles3);
		main(doubles2);
		main(doubles);
	}
	public static void main(Double[] args) {
		Double p1 =  args[0];
		Double p2 =  args[1];
		Paar<Double> p = new Paar<>(p1,p2);
		int res = p.myCompare((a, b) -> {
			if(a - b < 0.0){
				return -1;
			}
			else {
				if(b - a < 0.0 ){
					return 1;
				}
				else {
					return 0;
				}
			}
		});
		System.out.println("Paar("+p1+","+p2+").myCompare(...) = "+res);
	}
}
