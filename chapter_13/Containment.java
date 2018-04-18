package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 485
 * Implements MyClass
 * An example of a generalized interface. It is assumed that the class that implements this interface contains one or more values.
 */

public interface Containment<T> {

	// The contains() method checks to see if there is any element in the object of
	// the class that implements the Containment interface

	boolean contains(T o);
}