/**
 * Bounds
 * Name:
 * Matrikelnummer:
 */

public class Bounds{
	public static <T, E extends T> void copy(Paar<E> src, Paar<T> dst){
		dst.p1 = src.p1;
		dst.p2 = src.p2;
	}
}
