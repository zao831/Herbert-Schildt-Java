package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 177
 * Storing in queue data type int
 */

public class Queue2 {

	// Array for storing queue elements
	int[] q;

	// Indices for inserting and extracting queue elements
	int putloc, getloc;

	// The constructor creates a queue of a given size
	public Queue2(int size) {
		q = new int[size + 1];
		putloc = getloc = 0;
	}

	// Put a character in the queue
	void put(int ch) {
		if (putloc == q.length - 1) {
			System.out.println(" " + "- The array is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}

	// Extract character from queue
	int get() {
		if (getloc == putloc) {
			System.out.print(" \n\n" + "- The array is empty." + " Elements - ");
			return 0;
		}
		getloc++;
		return q[getloc];

	}
}