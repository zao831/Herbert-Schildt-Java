package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 332
 * In catch operator, subclasses must precede superclass exceptions
 */

public class ExcDemo5 {

	public static void main(String[] args) {

		// The length of the array numer exceeds the length of the denom array
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " equally " + numer[i] / denom[i]);
			}

			catch (ArrayIndexOutOfBoundsException exc) { // Interception of a subclass exception
				// Catch an exception
				System.out.println("Corresponding element not found");
			}

			catch (Throwable exc) { // Interception of the superclass exception
				System.out.println("An exception occurred");
			}
		}
	}
}