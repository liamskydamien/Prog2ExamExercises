package DritteProbeklausur;

import java.util.Comparator;


public class ComperatorFlurstück<Flurstueck> implements Comparator<DritteProbeklausur.Flurstueck> {
    @Override
    public int compare(DritteProbeklausur.Flurstueck o1, DritteProbeklausur.Flurstueck o2) {
        return o1.getGroesse() - o2.getGroesse();
    }
}
