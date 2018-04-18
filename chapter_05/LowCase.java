package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 193
 * Convert uppercase letters of the English alphabet to lowercase
 */

public class LowCase {

	public static void main(String[] args) {

		char ch;

		for (int i = 0; i < 10; i++) {

			ch = (char) ('A' + i);
			System.out.print(ch);

			// As a result of setting the value of the variable "ch" to one sixth bit, it
			// will always contain a capital letter
			ch = (char) ((int) ch | 32);

			System.out.print(ch + " ");

		}
	}
}