package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 109
 * Demonstration use "do-while" cycle
 */

public class DWDemo {

	public static void main(String[] args) throws java.io.IOException {

		char ch;

		do {
			System.out.println("Press the desired key, then <ENTER: >");

			// Get char from the keyboard
			ch = (char) System.in.read();

		} while (ch != 'q');
	}
}
