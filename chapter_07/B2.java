package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 272
 * Super class A2
 * Executing Override
 */

public class B2 extends A2 {

	int k;

	B2(int a, int b, int c) {

		super(a, b);
		k = c;
	}

	// Displaying variable k
	void show() {
		System.out.println("k: " + k);
	}
}