package DritteProbeklausur;

public class Boxer extends Person{

    private int gewicht;

    public Boxer(String vorname, String nachname, int gewicht) {
        super(vorname, nachname);
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
