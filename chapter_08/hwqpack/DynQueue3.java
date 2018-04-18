package chapter_08.hwqpack;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 320
 * Questions and exercises 
 * for self-examination
 * Question number 1
 */

public class DynQueue3 implements ICharQ3 {
	
	private char[] q; // Array for storing queue elements
	private int putloc, getloc; // indexes of inserted and extracted elements

	// Create an empty queue of a given size
	public DynQueue3(int size) {
		q = new char[size + 1]; // Select memory for the queue
		putloc = getloc = 0;
	}

	// Put a character in the queue
	public void put(char ch) {
		if (putloc == q.length - 1) {

			// Increase queue size
			char[] t = new char[q.length * 2];

			// Copy items to a new queue
			for (int i = 0; i < q.length; i++)
				t[i] = q[i];
			q = t;
		}

		putloc++;
		q[putloc] = ch;
	}

	// Extract character from queue
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - The queue is empty");
			return (char) 0;
		}

		getloc++;
		return q[getloc];
	}
}