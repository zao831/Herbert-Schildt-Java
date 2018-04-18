package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 * An exception indicating that the stack is empty
 */

@SuppressWarnings("serial")
public class StackEmptyExeption extends Exception {

	@Override
	public String toString() {
		return "\nThe stack is empty.";
	}
}