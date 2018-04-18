package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 120
 * Apply a "continue" operator with a label
 */

public class ContToLabel {

	public static void main(String[] args) {

		outerloop: for (int i = 1; i < 10; i++) {

			System.out.print("\nExternal cycle: pass " + i + ", inner cycle: ");

			for (int j = 1; j < 10; j++) {

				// Continue external cycle
				if (j == 5)
					continue outerloop;

				System.out.print(j + "; ");

			}
		}
	}
}
