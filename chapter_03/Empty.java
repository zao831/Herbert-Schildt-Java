package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 104
 * Skipping individual components in the cycle definition "for"
 */

public class Empty {

	public static void main(String[] args) {
		int i;

		for (i = 0; i < 10;) { // Iterative expression missing

			System.out.println("Passage # " + i);

			i++; // Increment the cycle variable

		}
	}
}
