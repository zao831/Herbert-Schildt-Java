package chapter_05.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 202
 * Questions and exercises 
 * for self-examination
 * Question number 6
 */

public class ILJ {

	public static void main(String[] args) {

		String str = "I like Java";

		System.out.println(str);

		for (int i = 0; i < str.length(); i++)
			System.out.print(str.charAt(i));

		System.out.println("\nLength str: " + str.length());

		// Answer from the book
		System.out.println("Length str: I like Java".length());

		for (int i = 0; i < str.length(); i++)
			System.out.print("I like Java".charAt(i));

	}
}