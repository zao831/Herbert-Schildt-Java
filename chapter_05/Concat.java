package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 185
 * A simple example of concatenation
 */

public class Concat {

	public static void main(String[] args) {

		// The concatenation process
		String str1 = "One";
		String str2 = "Two";
		String str3 = "Three";
		String str4 = str1 + str2 + str3;

		System.out.println(str4);

	}
}