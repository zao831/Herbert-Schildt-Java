package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 327
 */

public class ExcDemo1 {

	public static void main(String[] args) {
		
		int[] nums = new int[4];

		try { // Create a try block
			System.out.println("Before generating an exception");

			nums[7] = 10; // An attempt to use an index that goes beyond the bounds of an array
			System.out.println("This row will not be displayed");
		}

		catch (ArrayIndexOutOfBoundsException exc) { // Interception of exceptions caused by going beyond the boundaries
														// of the array
			System.out.println("Overflowing the array!");
		}
		System.out.println("After catch operator");

	}
}