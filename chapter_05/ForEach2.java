package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 180
 * Using an extended cycle to process a two-dimensional array
 * There are own additions
 */

public class ForEach2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int[][] nums = new int[3][5];

		// Arbitrarily fill an array
		for (int i = 0; i < 3; i++) {

			System.out.print(i + 1 + ") ");

			for (int j = 0; j < 5; j++) {

				nums[i][j] = (i + 1) * (j + 1);
				System.out.print(nums[i][j] + " ");

			}

			System.out.println();

		}

		// Use for-each for sum and display
		System.out.print("Value: ");

		for (int x[] : nums) {

			for (int y : x) {
				System.out.print(y + " ");
				sum += y;

			}
		}

		System.out.println("\nSum: " + sum);

	}
}