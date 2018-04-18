package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 490
 * Exercise 13.1
 * An exception indicating that the queue is empty
 */

@SuppressWarnings("serial")
public class QueueEmptyException extends Exception {

	@Override
	public String toString() {
		return "\nThe queue is empty.";
	}
}