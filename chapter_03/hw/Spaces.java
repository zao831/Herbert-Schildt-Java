package chapter_03.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 125
 * Questions and exercises for self-examination
 * Question number 1
 */

public class Spaces {

	public static void main(String[] args) throws java.io.IOException {

		char ch;
		int spaces = 0;

		System.out.println("To stop, press the dot symbol");

		do {
			ch = (char) System.in.read();

			if (ch == ' ')
				spaces++;

		} while (ch != '.');

		System.out.println("Spaces: " + spaces);
	}
}
