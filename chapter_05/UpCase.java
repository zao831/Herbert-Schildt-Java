package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 191
 * Convert lowercase English alphabet to uppercase
 */

public class UpCase {

	public static void main(String[] args) {
		
		char ch;

		for (int i = 0; i < 10; i++) {
			
			ch = (char) ('a' + i);
			System.out.print(ch);

			// The sixth bit is reset in the next operator. After that, the variable "ch"
			// will store the code of the capital letter
			ch = (char) (ch & 65503);

			System.out.print(ch + " ");

		}
	}
}