package chapter_03;

/*
 * 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 113
 * Using the break operator to exit the cycle
 */

public class BreakDemo {

	public static void main(String[] args) {
		int num;
		num = 100;

		// Do the cycle until the square of the variable "i" is less than the value of
		// the variable "num"
		for (int i = 0; i < num; i++) {

			// Stop the cycle if "i * i" >= 100
			if (i * i >= num)
				break;
			System.out.print(i + " ");

		}

		System.out.println("... Done! Cycle completed.");

	}
}
