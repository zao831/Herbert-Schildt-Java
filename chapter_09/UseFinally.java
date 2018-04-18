package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 339
 * Executing FinallyDemo
 * Using the finally block slightly changed the source code by initializing the variable t
 */

public class UseFinally {
	
	public static void genException(int what) {

		int t = 10;
		int[] nums = new int[2];

		System.out.println("Received: " + what);
		try {
			switch (what) {
			case 0:
				t = t / what; // Generate a division error by zero
				break;
			case 1:
				nums[4] = 4; // Generate array access error
				break;
			case 2:
				return; // Return from the try block
			}
		} catch (ArithmeticException exc) {
			// Catch an exception
			System.out.println("Attempt to divide by zero");
			return; // Return from the catch block
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Catch an exception
			System.out.println("Corresponding element not found");
		} finally { // This block is executed regardless of how the block try/catch is terminated
			System.out.println("Exit the try block");
		}
	}
}