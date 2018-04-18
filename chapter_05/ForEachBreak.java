package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 179
 * Use of the "for-each" with "break" operator
 */

public class ForEachBreak {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		System.out.print("Value: ");

		// Sum the first 5 elements of an array
		for (int x : nums) {

			System.out.print(x + " ");
			sum += x;
			// Terminate the cycle when it reaches 5
			if (x == 5)
				break;

		}
		System.out.println("\nSum: " + sum);

	}
}