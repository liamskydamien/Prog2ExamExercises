/*
 * 2.2.2022 Klausur Programmieren 2
 * Name:
 * Matrikelnummer:
 */
public class SortierterSpeicher<T extends Comparable<T>> extends Speicher1<T>{

    @Override
    public void insert(T o){
        if(countOperations == start){
            countOperations = 0;
            start = random.nextInt(3) + 2;
            return;
        }
        if (speicher.length == counter){
            T[] puffer = createDoubleArray();
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
        }
        countOperations++;
        speicher[counter++] = o;
    }
}
