package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 490
 * Exercise 13.1
 */

public interface IGenQ<T> {

	// Put the element in queue
	void put(T ch);

	// Get the element in queue
	T get();
}