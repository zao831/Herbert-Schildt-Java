package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 119
 * Using the "continue" operator
 */

public class ContDemo {

	public static void main(String[] args) {

		int i;

		// Output even numbers between 0 and 100
		for (i = 0; i <= 100; i++) {

			// Complete the iteration step of the cycle
			if ((i % 2) != 0)
				continue;

			System.out.print(i + " ");

		}
	}
}
