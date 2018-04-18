package chapter_09.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 351
 * Questions and exercises 
 * for self-examination
 * Question number 10
 * Implements Stack (package chapter_9.hw)
 */

@SuppressWarnings("serial")
public class StackFullException extends Exception {

	int size;

	StackFullException(int s) {
		size = s;
	}

	public String toString() {
		return "The stack is full. Maximum stack size: " + size;
	}
}