package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 92
 * The game of guess the symbol
 */

public class Guess {

	public static void main(String[] args) throws java.io.IOException {
		
		char ch, answer = 'S';

		System.out.println("A char from the range A - Z is conceived");
		System.out.print("Try to guess it: ");

		// Get a char from the keyboard
		ch = (char) System.in.read();

		if (ch == answer)
			System.out.println("** Correctly! **");

	}
}
