package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 312
 * Executing IQDemo2
 */

public class DynQueue2 implements ICharQ2 {

	private char[] q; // Array for storing queue elements
	private int putloc, getloc; // indexes of inserted and extracted elements

	// Create an empty queue of a given size
	public DynQueue2(int size) {
		q = new char[size + 1]; // Select memory for the queue
		putloc = getloc = 0;
	}

	public void put(char ch) {
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("The queue is full");
			return;
		}

		putloc++;
		if (putloc == q.length)
			putloc = 0;
		q[putloc] = ch;
	}

	public char get() {
		if (getloc == putloc) {
			System.out.println("The queue is empty");
			return (char) 0;
		}

		getloc++;
		if (getloc == q.length)
			getloc = 0;
		return q[getloc];
	}

	public char reset() {
		getloc = putloc = 0;
		System.out.println("Resetting the queue");
		return (char) 0;
	}
}