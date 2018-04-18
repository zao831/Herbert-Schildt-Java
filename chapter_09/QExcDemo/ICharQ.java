package chapter_09.QExcDemo;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 348
 * Exercise 9.1
 * Executing QExcDemo
 */

public interface ICharQ {

	// Put a character in the queue
	void put(char ch) throws QueueFullException;

	// Extract character from queue
	char get() throws QueueEmptyException;

}