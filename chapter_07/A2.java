package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 272
 * Subclass В2, B3, B4
 */

public class A2 {
	int i, j;

	A2(int a, int b) {
		i = a;
		j = b;
	}

	// Display variables i и j
	void show() {

		System.out.println("i и j: " + i + ", " + j);
	}
}