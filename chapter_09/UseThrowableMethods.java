package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 337
 */

public class UseThrowableMethods {

	public static void main(String[] args) {

		try {
			ExcTest2.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {

			// Catch an exception
			System.out.println("Standard message: ");
			System.out.println(exc);
			System.out.println("\nStack a calls: ");
			exc.printStackTrace();
		}
		System.out.println("After the catch operator");
	}
}