package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 239
 * Demonstration of using a method with a variable number of arguments
 */

public class VarArgs {

	// The method waTest() allows a variable number of arguments
	static void vaTest(int... v) {
		System.out.println("Number of arguments: " + v.length);
		System.out.println("Content: ");

		for (int i = 0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);

		System.out.println();

	}

	public static void main(String args[]) {

		// The waTest() method can be called with a variable number of arguments
		vaTest(10); // One argument
		vaTest(1, 2, 3); // Three arguments
		vaTest(); // No arguments

	}
}