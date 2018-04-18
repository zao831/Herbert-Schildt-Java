package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 103
 * The use of commas in the "for" cycle
 */

public class Comma {

	public static void main(String[] args) {

		int i, j;

		for (i = 0, j = 10; i < j; i++, j--) { // To manage this cycle, uses two variables

			System.out.println("i and j: " + i + " " + j);

		}
	}
}
