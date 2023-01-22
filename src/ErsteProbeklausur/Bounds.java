package ErsteProbeklausur;

/**
 * ErsteProbeklausur.Bounds
 * Name:
 * Matrikelnummer:
 */

public class Bounds{
	public static <T, E extends T> void copy(Paar<E> src, Paar<T> dst){
		dst.p1 = src.p1;
		dst.p2 = src.p2;
	}

	public static <T, E extends T> void copy(SpeicherIF<E> src, SpeicherIF<T> dst){
		String[] newVals = src.toString().substring(1,src.toString().length()-1).split(",");
		int sizeCounter = dst.size();
		for (String e : newVals){
			dst.insert((T) e);
			if(sizeCounter >= dst.size()){
				dst.insert((T) e);
			}
			sizeCounter = dst.size();
		}
	}
}
