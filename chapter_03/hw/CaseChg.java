package chapter_03.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 126
 * Questions and exercises for self-examination
 * Question number 10
 */

public class CaseChg {

	public static void main(String[] args) throws java.io.IOException {

		char ch;
		int changes = 0;

		System.out.println("To stop, enter the dot symbol");

		do {
			ch = (char) System.in.read();

			if (ch >= 'a' & ch <= 'z') {
				ch -= 32;
				changes++;
				System.out.println(ch + "\n");

			} else if (ch >= 'A' & ch <= 'Z') {

				ch += 32;
				changes++;
				System.out.println(ch + "\n");

			}

		} while (ch != '.');

		System.out.println("\nChanging the register: " + changes);

	}
}
