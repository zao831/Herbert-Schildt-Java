package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 72
 * This program does not pass the compilation
 */

public class NestVar {

	public static void main(String[] args) {
		int count;

		for (count = 0; count < 10; count++) {
			System.out.println("count: " + count);

			// int count; // Invalid. The variable has already been declared
			for (count = 0; count < 2; count++)
				System.out.println("This program has an error");
		}
	}
}
