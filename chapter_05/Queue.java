package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 174
 * Exercise 5.2
 * A class implementing a queue for storing characters
 * Execute QDemo
 */

public class Queue {

	// Array for storing queue elements
	char[] q;

	// Indices for inserting and extracting queue elements
	int putloc, getloc;

	// The constructor creates a queue of a given size
	public Queue(int size) {

		q = new char[size + 1];
		putloc = getloc = 0;

	}

	// Put a character in the queue
	void put(char ch) {

		if (putloc == q.length - 1) {
			System.out.println(" - The queue is full");
			return;

		}

		putloc++;
		q[putloc] = ch;

	}

	// Extract character from queue
	char get() {

		if (getloc == putloc) {
			System.out.println(" - The queue is empty");
			return (char) 0;

		}

		getloc++;
		return q[getloc];

	}
}