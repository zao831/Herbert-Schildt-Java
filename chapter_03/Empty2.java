package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 104
 * Skipping individual components in the cycle definition "for"
 */

public class Empty2 {

	public static void main(String[] args) {
		int i = 0;

		for (; i < 10;) { // excluded initialization expression

			System.out.println("Passage # " + i);

			i++; // Increment the cycle variable

		}
	}
}
