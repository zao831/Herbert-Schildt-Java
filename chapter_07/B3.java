package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 272
 * Super class A2
 * Executing Override1
 */

public class B3 extends A2 {

	int k;

	B3(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Displaying variable k
	void show() {
		super.show();
		System.out.println("k: " + k);
	}
}