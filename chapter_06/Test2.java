package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 213
 * Methods for passing arguments to the method by calling by value / by reference. Objects are passed to methods by reference
 * Executable - CallByRef
 */

public class Test2 {
	
	int a, b;

	Test2(int i, int j) {
		a = i;
		b = j;
	}

	// Passing an object to the method. Now, the object's ob.a and ob.b variables
	// used in the call will also change
	void change(Test2 ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;

		// Equivalently
		// a = a + b;
		// b = - b;

	}
}