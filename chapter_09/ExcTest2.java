package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 337
 * Using methods from the Throwable class
 * Executable UseThrowableMethods
 */

public class ExcTest2 {

	static void genException() {

		int[] nums = new int[4];

		System.out.println("Before generating an exception");

		// Generate an exception due to overflow of the array
		nums[7] = 10;
		System.out.println("This row will not be displayed");
	}
}