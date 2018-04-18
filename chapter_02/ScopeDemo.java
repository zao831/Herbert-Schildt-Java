package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 70
 * Demonstrating the action scope of a code block
 */

public class ScopeDemo {

	public static void main(String[] args) {
		
		int x; // x available for all code in main method

		x = 10;
		if (x == 10) { // Beginning a new action area
			int y = 20; // y is available only in this block

			/*
			 * Both variable "x" and "y" is available in this code block
			 */

			System.out.println("x = " + x + ", y = " + y);
			x = y * 2;
		}
		// Error! In this place variable "y" is not available

		// Variable "x" as still available
		System.out.println("x is " + x);
	}
}
