package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 329
 */

public class ExcTypeMismatch {

	public static void main(String[] args) {

		int[] nums = new int[4];

		try {
			System.out.println("Before generating an exception");

			// Generate an exception in connection with the output of the index beyond the
			// boundaries of the array

			nums[7] = 10; // Here an exception is thrown ArrayIndexOutOfBoundsException
			System.out.println("This row will not be displayed");
		}

		// The exception associated with accessing the boundaries of an array can not be
		// handled using the catch statement, which specifies the ArithmeticException

		catch (ArithmeticException exc) {
			// Catch an exception
			System.out.println("Overflowing the Array!");
		}
		System.out.println("After catch operator");
	}
}