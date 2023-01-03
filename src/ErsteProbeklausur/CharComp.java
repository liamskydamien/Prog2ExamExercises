package ErsteProbeklausur; /**
 * Comparator für Character
 */
import java.util.Comparator;

public class CharComp implements Comparator<Character>{
	@Override
	public int compare(Character arg0, Character arg1) {
		return arg0 - arg1;
	}
}