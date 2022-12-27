/*
 * Die Schnittstelle SpeicherIF beschreibt Methoden zum Zugriff auf einen Speicher.
 */
public interface SpeicherIF<T> {
	// Fuege das Element 'e' in den Speicher ein
	public void insert(T e);
	// Element entnehmen und zurückgeben
	// wirft NoSuchElementException bei leerem Speicher
	public T remove();
	// liefert 'true', wenn der Speicher leer ist, sonst 'false'
	public boolean isEmpty();
	// liefert die aktuelle Belegung des Speicher
	public int size();
	// gibt den Speicherinhalt in der Form
	// [element1,element2,...,elementN]
	// zurück
	public String toString();
}
