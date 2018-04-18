package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 307
 * Exercise 8.1
 * A class that implements 
 * a fixed-size queue for 
 * storing characters
 * Executing IQDemo
 */

public class FixedQueue implements ICharQ {

	private char[] q; // Array for storing queue elements
	private int putloc, getloc; // indexes of inserted and extracted elements

	// Create an empty queue of a given size
	public FixedQueue(int size) {
		q = new char[size + 1]; // Select memory for the queue
		putloc = getloc = 0;
	}

	// Put a character in the queue
	public void put(char ch) {
		if (putloc == q.length - 1) {
			System.out.println(" - The queue is full");
			return;
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