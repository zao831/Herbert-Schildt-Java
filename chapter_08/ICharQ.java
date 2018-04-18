package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 307
 * Exercise 8.1
 * Interface for character queue
 * FixedQueue, DynQueue, CircularQueue
 */

public interface ICharQ {

	// Put a character in the queue
	void put(char ch);

	// Extract character from queue
	char get();

}