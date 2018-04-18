package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 164
 * Exercise 5.1
 * Example of implementation of the bubble sort algorithm
 * Added counting iteration cycles
 */

public class Вubblе {

	public static void main(String[] args) {

		int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		int a, b, t;
		int size, iternum1 = 1, iternum2 = 1;

		size = 10; // Number of elements to sort

		// Display the original array
		System.out.print("Original array: ");

		for (int i = 0; i < size; i++)

			System.out.print(" " + nums[i]);

		System.out.println();

		// Implement the bubble sort algorithm
		for (a = 1; a < size; a++) {

			System.out.println("iternum1: " + iternum1 + " a: " + a);

			for (b = size - 1; b >= a; b--) {

				System.out.println("iternum2: " + iternum2 + " b: " + b);

				if (nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;

				}
				iternum2++;

				for (int k = 0; k < nums.length; k++)

					System.out.print(" " + nums[k]);

				System.out.println();

			}
			iternum1++;

		}

		// Display the sorted array
		System.out.print("\nSorted array: ");

		for (int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);

	}
}