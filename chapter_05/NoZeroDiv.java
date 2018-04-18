package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 201
 * Preventing division by zero with the "?" operator
 */

public class NoZeroDiv {

	public static void main(String[] args) {

		int result;

		for (int i = -5; i < 6; i++) {

			// Division by zero is prevented
			result = i != 0 ? 100 / i : 0;
			if (i != 0)
				System.out.println("100 / " + i + " equally " + result);

		}
	}
}