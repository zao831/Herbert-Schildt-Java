package chapter_03.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 125
 * Questions and exercises for self-examination
 * Question number 4
 */

public class ForOneThousand {

	public static void main(String[] args) {

		for (int i = 1000; i >= 0; i -= 2) {
			System.out.println(i);
		}
	}
}
