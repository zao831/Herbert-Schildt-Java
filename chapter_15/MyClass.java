package chapter_15;

/**
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 564
 */

public class MyClass {
	
	int a, b;

	// Initialize the variables a and b separately
	public MyClass(int i, int j) {
		a = i;
		b = j;
	}

	// Use the this() expression to initialize the variables a and b the same value
	public MyClass(int i) {
		this(i, i); // Call constructor MyClass(int i, int j)
	}
}