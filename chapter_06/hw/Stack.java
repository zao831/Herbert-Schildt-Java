package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 3
 * Executing - StackDemo
 */

public class Stack {

	// Array for storing queue elements
	private char[] q;

	// Indices for inserting and extracting queue elements
	private int putloc;

	// The constructor creates a queue of a given size
	Stack(int size) {
		q = new char[size];
		putloc = 0;
	}

	// Put a character in the queue
	void push(char ch) {
		if (putloc == q.length) {
			System.out.println(" - full");
			return;
		}
		q[putloc] = ch;
		putloc++;
	}

	// Extract character from queue
	char pop() {
		if (putloc == 0) {
			System.out.println(" - empty");
			return (char) 0;
		}
		putloc--;
		return q[putloc];

	}
}