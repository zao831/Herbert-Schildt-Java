package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 94
 * Demonstration of multi-stage construction if-else-if
 */

public class Ladder {

	public static void main(String[] args) {

		int x;

		for (x = 0; x < 6; x++) {

			if (x == 1)
				System.out.println("Х equal 1");

			else if (x == 2)
				System.out.println("Х equal 2");

			else if (x == 3)
				System.out.println("Х equal 3");

			else if (x == 4)
				System.out.println("Х equal 4");

			else
				// The default condition
				System.out.println("The value of X is on the outside of the range 1 - 4");

		}
	}
}
