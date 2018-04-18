package chapter_09.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 351
 * Questions and exercises 
 * for self-examination
 * Question number 10
 * Executing StackDemo (package chapter_9.hw)
 */

public class Stack {
	
	private char[] stck; // Array for storing the stack elements
	private int tos; // The top of the stack

	// Create an empty stack of the specified size
	public Stack(int size) {
		stck = new char[size]; // Allocate memory for the stack
		tos = 0;
	}

	// Create one stack from another stack
	Stack(Stack ob) {
		tos = ob.tos;
		stck = new char[ob.stck.length];

		// Copy items
		for (int i = 0; i < tos; i++)
			stck[i] = ob.stck[i];
	}

	// Create a stack with initial values
	Stack(char[] a) {
		stck = new char[a.length];

		for (int i = 0; i < a.length; i++) {
			try {
				push(a[i]);
			} catch (StackFullException exc) {
				System.out.println(exc);
			}
		}
	}

	// Put the characters on the stack
	void push(char ch) throws StackFullException {
		if (tos == stck.length)
			throw new StackFullException(stck.length);

		stck[tos] = ch;
		tos++;
	}

	// Extract characters from the stack
	char pop() throws StackEmptyException {
		if (tos == 0)
			throw new StackEmptyException();

		tos--;
		return stck[tos];
	}
}