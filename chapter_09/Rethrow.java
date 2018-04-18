package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 336
 * Executing RethrowDemo
 */

public class Rethrow {
	
	public static void genException() {

		// The length of the array numer exceeds the length of the denom array
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " equally " + numer[i] / denom[i]);
			} catch (ArithmeticException exc) {
				// Catch an exception
				System.out.println("Attempt to divide by zero");
			} catch (ArrayIndexOutOfBoundsException exc) {
				// Catch an exception
				System.out.println("Corresponding element not found");
				throw exc; // Re-generate an exception
			}
		}
	}
}