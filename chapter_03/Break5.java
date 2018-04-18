package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 117
 * Another example of a break operator with a label
 */

public class Break5 {

	public static void main(String[] args) {

		done: for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				for (int k = 0; k < 10; k++) {

					System.out.print(k + "; ");

					if (k == 5)
						break done; // Go to label "done"

				}

				System.out.println("After the cycle k"); // Will not work

			}

			System.out.println("After the cycle j"); // Will not work

		}

		System.out.println("\nAfter the cycle «i»");

	}
}
