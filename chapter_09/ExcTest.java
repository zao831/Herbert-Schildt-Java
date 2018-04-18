package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 328
 * An exception can be generated by one method, but intercepted by another
 */

public class ExcTest {

	// Exception generation
	static void genException() {
		
		int[] nums = new int[4];

		System.out.println("Before generating an exception");

		// Generate an exception due to overflow of the array

		nums[7] = 10;// Here an exception is thrown

		System.out.println("This row will not be displayed");
	}
}