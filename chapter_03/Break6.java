package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 117
 * The location of the mark is of great importance
 */

public class Break6 {

	public static void main(String[] args) {
		
		int x = 0, y = 0;

		// Here the label is placed in front of the "for" operator
		stop1: for (x = 0; x < 5; x++) {

			for (y = 0; y < 5; y++) {

				if (y == 2)
					break stop1;

				System.out.println("x and y: " + x + "; " + y);

			}
		}

		System.out.println("\nDone stop1.\n");

		// Here the label is located just before the opening brace
		for (x = 0; x < 5; x++)

			stop2: {

				for (y = 0; y < 5; y++) {

					if (y == 2)
						break stop2;

					System.out.println("x and y: " + x + "; " + y);

				}
			}

		System.out.println("\nDone stop2.\n\nThe program is complete.");

	}
}
