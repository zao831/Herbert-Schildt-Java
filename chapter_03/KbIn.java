package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 91
 * Reading a character from the keyboard
 */

public class KbIn {

	public static void main(String[] args) throws java.io.IOException { // Exception handler

		char ch;

		System.out.print("Press the desired key, then press ENTER: ");

		ch = (char) System.in.read(); // Get character

		System.out.println("You pressed the key: " + ch);

	}
}
