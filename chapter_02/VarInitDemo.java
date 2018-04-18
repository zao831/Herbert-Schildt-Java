package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 71
 * Demonstration of the lifetime of a variable
 */

public class VarInitDemo {

	public static void main(String[] args) {
		
		int x;

		for (x = 0; x < 3; x++) {

			int y = -1; // The variable "y" is initialized every time you enter the block

			System.out.println("y: " + y);

			y = 100;
			System.out.println("Initial value у: " + y);
		}
	}
}
