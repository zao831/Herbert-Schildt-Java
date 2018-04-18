package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * A personal example for learning
 */

public class ExcDemoX {

	public static void main(String[] args) {

		int nums[] = new int[4];

		try { // Create a try block
			System.out.println("Before generating an exception");

			nums[0] = 10; // An attempt to use an index that goes beyond the bounds of an array
			System.out.println("This row will not be displayed");
		}

		catch (ArrayIndexOutOfBoundsException exc) { // Interception of exceptions if it exceeds the boundaries of the
														// array
			System.out.println("Overflowing the Array!");
		}
		System.out.println("After catch operator");

	}
}