package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 180
 * The "for-each" cycle are is intended only read
 */

public class NoChange {

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("nums: ");
		
		for (int x : nums) {
			
			System.out.print(x + " ");

			// This operation no change to element in array
			x = x * 10;
			
		}

		System.out.print("\nnums: ");
		
		for (int x : nums)
			System.out.print(x + " ");

	}
}