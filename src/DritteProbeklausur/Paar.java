package DritteProbeklausur;

public class Paar<T extends Person, E extends Person>{
    private T erstesElement;
    private E zweitesElement;

    public Paar(T erstesElement, E zweitesElement){
        this.erstesElement = erstesElement;
        this.zweitesElement = zweitesElement;
    }

    public T getErste(){
        return erstesElement;
    }

    public E getZweites(){
        return zweitesElement;
    }
}
