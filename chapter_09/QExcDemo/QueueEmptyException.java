package chapter_09.QExcDemo;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 348
 * Exercise 9.1
 * Empty Queue Exception Class
 * Executing QExcDemo
 */

@SuppressWarnings("serial")
public class QueueEmptyException extends Exception {

	public String toString() {
		return "- Error! The queue is empty.";
	}
}