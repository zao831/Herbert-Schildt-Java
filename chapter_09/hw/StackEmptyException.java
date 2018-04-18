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
public class StackEmptyException extends Exception {

	public String toString() {
		return "\nStack is empty.";
	}
}