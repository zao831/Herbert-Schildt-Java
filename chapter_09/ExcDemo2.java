package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 328
 */

public class ExcDemo2 {

	public static void main(String[] args) {

		try {
			ExcTest.genException();
		}
		// Catch an exception from method (ExcTest)
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Overflowing the array!");
		}

		System.out.println("After catch operator");

	}
}