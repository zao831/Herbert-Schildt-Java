package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 472
 * Executing SimpGen
 * A simple generalized class with two parameters of the type: T and V
 */

public class TwoGen<T, V> {
	T ob1;
	V ob2;

	// Pass the constructor a references to an objects of type T and V
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	// Display T and V types
	void showTypes() {
		System.out.println("T type - this " + ob1.getClass().getName());
		System.out.println("V type - this " + ob2.getClass().getName());
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}
}