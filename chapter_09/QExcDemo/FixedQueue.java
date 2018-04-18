package chapter_09.QExcDemo;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 348
 * Exercise 9.1
 * Executing QExcDemo
 */

public class FixedQueue implements ICharQ {

	private char[] q; // An array for storing the queue
	private int putloc, getloc; // Indexes for inserting and extracting queue elements

	// Create a blank queue of the specified size
	public FixedQueue(int size) {
		q = new char[size + 1]; // Select memory for the queue
		putloc = getloc = 0;
	}

	// Put a character in the queue
	public void put(char ch) throws QueueFullException {

		if (putloc == q.length - 1)
			throw new QueueFullException(q.length - 1);

		putloc++;
		q[putloc] = ch;
	}

	// Extract character from queue
	public char get() throws QueueEmptyException {

		if (getloc == putloc)
			throw new QueueEmptyException();

		getloc++;
		return q[getloc];
	}
}