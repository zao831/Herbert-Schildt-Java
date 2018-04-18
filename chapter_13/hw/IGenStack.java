package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 */

public interface IGenStack<T> {

	// Push the element in stack
	void push(T ch) throws StackFullExeption;

	// Get the element from stack
	T get() throws StackEmptyExeption;
}