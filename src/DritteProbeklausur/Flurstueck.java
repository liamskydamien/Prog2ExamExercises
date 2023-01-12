package DritteProbeklausur;

public class Flurstueck {
    private int nummer;
    private int groesse;

    public Flurstueck(int nummer , int groesse ) {
        this.groesse = groesse ;
        this.nummer = nummer ;
    }
    public int getGroesse () { return groesse ;}
    public int getNummer () { return nummer ;}
}