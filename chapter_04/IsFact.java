package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 141
 */

public class IsFact {
	public static void main(String[] args) {

		Factor x = new Factor();

		if (x.isFactor(2, 20)) // Passing an argument to the isFactor () method
			System.out.println("2 - divisor.");

		if (x.isFactor(3, 20)) // Passing an argument to the isFactor () method
			System.out.println("This line will not be displayed");

	}
}