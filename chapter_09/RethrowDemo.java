package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 336
 */

public class RethrowDemo {

	public static void main(String[] args) {

		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Re-generate an exception
			System.out.println("Fatal error - program execution aborted!");

		}
	}
}