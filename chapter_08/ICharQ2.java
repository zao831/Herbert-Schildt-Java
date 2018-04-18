package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 312
 * Interface for 
 * character queue DynQueue2
 */

public interface ICharQ2 {

	// Put a character in the queue
	void put(char ch);

	// Extract character from queue
	char get();

	// Reset queue
	char reset();

}