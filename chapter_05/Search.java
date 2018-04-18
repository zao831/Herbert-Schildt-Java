package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 182
 * Search in an array using the extended loop
 */

public class Search {

	public static void main(String[] args) {

		int[] nums = { 6, 8, 3, 7, 5, 6, 1, 4 };
		int val = 5;
		boolean found = false;

		// Use a cycle for-each to find the value of a variable val in an array nums
		for (int x : nums) {

			if (x == val) {
				found = true;
				break;

			}
		}

		if (found)
			System.out.println("Value found! In the nums array there is a value " + val);

	}
}