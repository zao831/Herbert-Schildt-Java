package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 86
 * Bringing one type to another to correctly calculate the expression
 */

public class UseCast {

	public static void main(String[] args) {
		
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println(i + " / 3: " + i / 3);
			System.out.println(i + " / 3 с дробной частью: " + (double) i / 3);
			System.out.println();
		}
	}
}
