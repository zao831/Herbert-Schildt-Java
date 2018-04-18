package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 * Exception indicating overflow
 */

@SuppressWarnings("serial")
public class StackFullExeption extends Exception {

	int size; // Size stack

	// Constructor
	public StackFullExeption(int s) {
		size = s;
	}

	@Override
	public String toString() {
		return "The stack is full. Maximum stack size: " + size;
	}
}