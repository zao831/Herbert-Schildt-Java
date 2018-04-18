package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 342
 */

public class MultiCatch {

	public static void main(String[] args) {

		int a = 88, b = 0;
		@SuppressWarnings("unused") // Suppressing the compiler warning that the result variable is not used
		int result;
		char[] chrs = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0)
					// Generate an exception ArithmeticException
					result = a / b;
				else
					// Generate an exception ArrayIndexOutOfBoundsException
					chrs[5] = 'X';
			}
			// In this catch operator, an interception is organized for both exceptions
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Intercepted exception: " + e);
			}
		}

		System.out.println("After a group exception trap");
	}
}