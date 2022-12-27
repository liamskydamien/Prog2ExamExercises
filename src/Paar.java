
import java.util.Comparator;

public class Paar<T>{
	T p1, p2;
	Paar(T p1, T p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	int myCompare(Comparator<T> c) {
		return c.compare(p1,p2);
	}
	public String toString() {
		return("("+p1+","+p2+")");
	}
}