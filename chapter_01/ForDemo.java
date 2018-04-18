package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 49
 * Demonstration of the use of "for" operator
 */

public class ForDemo {

	public static void main(String[] args) {
		
		int count;

		for (count = 0; count < 5; count = count + 1)
			// count++ = (count = count + 1)
			System.out.println("Counter value: " + count);

		System.out.println("Done!");

	}
}
