package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 274
 * Super class A2
 * Executing Overload
 */

public class B4 extends A2 {

	int k;

	B4(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Overload the show() method
	void show(String msg) { // The signature of this method and the show () method from class A is
							// different, so instead of overriding, the method overloading takes place
		System.out.println(msg + k);
	}
}