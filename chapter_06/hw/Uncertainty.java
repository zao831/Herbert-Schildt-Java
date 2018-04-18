package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 15
 */

public class Uncertainty {

	static void uncertainty(int... v) {
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}

	static void uncertainty(String... v) {
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		uncertainty("Test");
		uncertainty(1, 2, 3);
		// uncertainty(v); // Error! Uncertainty.

	}
}