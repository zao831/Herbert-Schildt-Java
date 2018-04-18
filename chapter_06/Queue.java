package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 210
 * Exercise 6.1 (page 209)
 * Modified file based on Exercise 6.2 (page 223)
 * Page 224
 * Executing - QDemo2 
 */

public class Queue {

	// Array for storing queue elements
	private char[] q;

	// Indices for inserting and extracting queue elements
	private int putloc, getloc;

	// The constructor creates a queue of a given size
	public Queue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}

	// A constructor that creates one Queue object based on another
	public Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// Copy queue items
		for (int i = getloc + 1; i <= putloc; i++)
			q[i] = ob.q[i];
	}

	// Construct a queue based on an array of initial values
	public Queue(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length + 1];

		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}

	// Put a character in the queue
	void put(char ch) {
		if (putloc == q.length - 1) {
			System.out.println(" " + "- The queue is full");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}

	// Extract character from queue
	char get() {
		if (getloc == putloc) {
			System.out.println(" " + "- The queue is empty");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}