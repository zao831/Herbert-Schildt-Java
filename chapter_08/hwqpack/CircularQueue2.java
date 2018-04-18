package chapter_08.hwqpack;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 320
 * Questions and exercises 
 * for self-examination
 * Question number 1
 */

public class CircularQueue2 implements ICharQ3 {

	private char[] q; // Array for storing queue elements
	private int putloc, getloc; // indexes of inserted and extracted elements

	// Create an empty queue of a given size
	public CircularQueue2(int size) {
		q = new char[size + 1]; // Select memory for the queue
		putloc = getloc = 0;
	}

	// Put a character in the queue
	public void put(char ch) {
		/*
		 * A queue is considered complete if the putloc index is one less than the
		 * getloc index or if the putloc index points to the end of the array, and the
		 * getloc index to its start
		 */
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println(" - The queue is full");
			return;
		}

		putloc++;
		if (putloc == q.length)
			putloc = 0; // Go to the top of the array
		q[putloc] = ch;
	}

	// Извлечь символ из очереди
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - The queue is empty");
			return (char) 0;
		}

		getloc++;
		if (getloc == q.length)
			getloc = 0; // back to the beginning of the queue
		return q[getloc];
	}
}