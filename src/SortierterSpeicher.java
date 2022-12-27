/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class SortierterSpeicher<T extends Comparable<T>> extends Speicher1<T>{

    public SortierterSpeicher(){
        super(true);
    }
    @Override
    @SuppressWarnings("unchecked")
    public void insert(T o){
        if(countOperations == start){
            countOperations = 0;
            start = random.nextInt(3) + 2;
            return;
        }
        T[] puffer;
        if (speicher.length == counter){
            puffer = createDoubleArray();
        }
        else {
            puffer = (T[]) new Comparable[speicher.length];
        }
        for(int i = 0; i < counter; i++){
            if(speicher[i].compareTo(o) >= 0){
                puffer[i] = o;
                o = speicher[i];
            }
            else {
                puffer[i] = speicher[i];
            }
        }
        speicher = puffer;
        countOperations++;
        speicher[counter++] = o;
    }
}
