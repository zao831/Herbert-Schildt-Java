package chapter_03.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 125
 * Questions and exercises for self-examination
 * Question number 1
 */

public class ReadChar {

	public static void main(String[] args) throws java.io.IOException {
		
		int count = 0;
		char choice, ignore;

		for (;;) {

			System.out.println("Enter the symbol");

			choice = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
				
			} while (ignore != '\n');

			count++;

			if (choice == '.')
				break;
			
		}
		
		System.out.println("Count: " + count + "\nThe program is completed. All the best!");

	}
}
