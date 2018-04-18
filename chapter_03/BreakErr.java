package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 118
 * The location of the mark is of great importance
 */

public class BreakErr {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		one: for (int i = 0; i < 3; i++) {

			System.out.println("Passage " + i + ": ");

			// The code block labeled one, does not contain a break statement, and therefore
			// control can not be passed to this block

		}
		for (int j = 0; j < 100; j++) {

			if (j == 10)
				// break one; // ERROR!

				System.out.print(j + " ");

		}
	}
}
