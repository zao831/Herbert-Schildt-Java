package chapter_03;

/*
 * English alphabet using the "for" cycle
 */

public class ForAlphabet {

	public static void main(String[] args) {

		char ch = 'a';

		for (int i = 1; ch <= 'z'; i++) {

			System.out.println(ch + " - " + i);

			ch++;

		}
	}
}
