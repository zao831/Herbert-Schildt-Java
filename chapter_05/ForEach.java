package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 179
 * Use of the variety "for-each" cycle "for"
 */

public class ForEach {

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		System.out.print("Value: ");

		// Use a for-each to sum and display
		for (int x : nums) {

			System.out.print(x + " ");
			sum += x;

		}

		System.out.println("\nSum: " + sum);

	}
}