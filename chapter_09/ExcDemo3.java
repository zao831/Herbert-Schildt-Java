package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 330
 * Correct exception handling and continuation of program execution
 */

public class ExcDemo3 {

	public static void main(String[] args) {

		int[] numer = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " equally " + numer[i] / denom[i]);
			} catch (ArithmeticException exc) {
				// Catch an exception
				System.out.println("Attempt to divide by zero!");
			}
		}
	}
}