package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 346
 */

public class CustomExceptDemo {

	public static void main(String[] args) {

		// The numer array contains odd "numbers"
		int[] numer = { 4, 8, 15, 32, 64, 127, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				if ((numer[i] % 2) != 0)
					throw new NonIntResultException(numer[i], denom[i]);
				System.out.println(numer[i] + " / " + denom[i] + " equally " + numer[i] / denom[i]);
			} catch (ArithmeticException exc) {
				// Catch an exception
				System.out.println("Attempt to divide by zero");
			} catch (ArrayIndexOutOfBoundsException exc) {
				// Catch an exception
				System.out.println("Corresponding element not found");
			} catch (NonIntResultException exc) {
				System.out.println(exc);
			}
		}
	}
}