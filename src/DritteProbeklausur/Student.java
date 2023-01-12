package DritteProbeklausur;

public class Student extends Person{

    private int matrikelnummer;

    public Student(String vorname, String nachname, int matrikelnummer) {
        super(vorname, nachname);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
}
