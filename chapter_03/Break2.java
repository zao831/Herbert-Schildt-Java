package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 114
 * Read the input data until a letter q is received
 */

public class Break2 {

	public static void main(String[] args) throws java.io.IOException {

		char ch;

		for (;;) {

			// Get the symbol from the keyboard
			ch = (char) System.in.read();
			if (ch == 'q')
				break;

		}

		System.out.println("You pressed key q!");

	}
}
