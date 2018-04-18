package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 183
 * Introducing the String class
 */

public class StringDemo {

	public static void main(String[] args) {

		// Different ways of declaring strings
		String str1 = new String("In Java, the strings are objects");
		String str2 = new String("They can be created in different ways");
		String str3 = new String(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}
}