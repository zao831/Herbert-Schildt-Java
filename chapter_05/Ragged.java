package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 167
 * Memory allocation for the second array index manually
 * Added counting iteration cycles
 */

public class Ragged {

	public static void main(String[] args) {

		int[][] riders = new int[7][];

		// For the first five elements, the length of the array with respect to the
		// second index is 10
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];

		// For the remaining two elements, the length of the array with respect to the
		// second index is 2
		riders[5] = new int[2];
		riders[6] = new int[2];

		int i, j;
		int count1 = 0, count2 = 0;

		// Generate arbitrary data
		for (i = 0; i < 5; i++)

			for (j = 0; j < 10; j++)
				riders[i][j] = i + j + 10;

		for (i = 5; i < 7; i++)

			for (j = 0; j < 2; j++)
				riders[i][j] = i + j + 10;

		System.out.println("The number of passengers carried by each flight, on weekdays of the week");

		for (i = 0; i < 5; i++) {

			count1++;
			for (j = 0; j < 10; j++) {
				System.out.print(riders[i][j] + " ");
				count2++;

			}

			System.out.println();

		}
		System.out.println();

		System.out.println("The number of passengers carried by each flight, on weekends");

		for (i = 5; i < 7; i++) {

			count1++;
			for (j = 0; j < 2; j++) {
				System.out.print(riders[i][j] + " ");
				count2++;

			}

			System.out.println();

		}

		System.out.println("\ncount1: " + count1 + "\ncount2: " + count2);

	}
}