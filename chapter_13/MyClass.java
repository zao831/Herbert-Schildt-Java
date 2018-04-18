package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 485
 * Executing GenIFDemo
 * Implement the Containment interface with an array that stores values.
 */

public class MyClass<T> implements Containment<T> {

	T[] arrayRef;

	public MyClass(T[] o) {
		arrayRef = o;
	}

	// Implements contains() method
	public boolean contains(T o) {
		for (T x : arrayRef)
			if (x.equals(o))
				return true;
		return false;
	}
}