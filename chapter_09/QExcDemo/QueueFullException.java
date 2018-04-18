package chapter_09.QExcDemo;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 348
 * Exercise 9.1
 * Fill Queue Exception Class
 * Executing QExcDemo
 */

@SuppressWarnings("serial")
public class QueueFullException extends Exception {

	int size;

	public QueueFullException(int s) {
		size = s;
	}

	public String toString() {
		return " - Error! The queue is full. Max queue size: " + size;
	}
}