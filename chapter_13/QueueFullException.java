package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 490
 * Exercise 13.1
 * Exception indicating overflow
 */

@SuppressWarnings("serial")
public class QueueFullException extends Exception {

	int size;

	public QueueFullException(int s) {
		size = s;
	}

	@Override
	public String toString() {
		return "\nThe queue is full. Maximum queue size: " + size;
	}
}