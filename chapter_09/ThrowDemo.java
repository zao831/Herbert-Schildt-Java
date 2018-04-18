package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 335
 */

public class ThrowDemo {
	
	public static void main(String args[]) {

		try {
			System.out.println("Before throw operator");
			throw new ArithmeticException(); // Exception generation
		} catch (ArithmeticException exc) {
			// Catch an exception
			System.out.println("Exception intercepted");
		}
		System.out.println("After block try/catch");
	}
}