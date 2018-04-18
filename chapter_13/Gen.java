package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 467
 * Executing GenDemo, RawDemo
 * A simple generalized class. Here, T is a parameter of the type, instead of which when the Gen_class object is created, in its place will be substituted for the actually existing type.
 */

public class Gen<T> {

	T ob; // Update type T object

	// Pass the constructor a reference to an object of type T
	Gen(T o) {
		ob = o;
	}

	// Return ob_object from method
	T getob() {
		return ob;
	}

	// Display T type
	void showType() {
		System.out.println("T type - this " + ob.getClass().getName());
	}
}