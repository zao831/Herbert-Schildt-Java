package chapter_03;
/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 109
 * The game of guess the symbol
 * Version 4.0
 */

public class Guess4 {

	public static void main(String[] args) throws java.io.IOException {
		char ch, ignore, answer = 'S';

		do {
			System.out.println("A char from the range A - Z is conceived");
			System.out.print("Try to guess it: ");

			// Get a char from the keyboard
			ch = (char) System.in.read();

			// Discard all other chars in the incoming buffer
			do {
				ignore = (char) System.in.read();

			} while (ignore != '\n');

			if (ch == answer)
				System.out.println("** Correctly! **");

			else {
				System.out.print("... Sorry, the letter you are looking for is ");

				if (ch > answer) // A nested operator "if"
					System.out.println("towards the end of the alphabet");
				else
					System.out.println("closer to the beginning of the alphabet");
			}

		} while (answer != ch);

	}
}
