package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 511
 * This lambda expression determines whether one line is part of another
 */

public class LambdaDemo3 {

	public static void main(String[] args) {

		StringTest isIn = (a, b) -> a.indexOf(b) != -1;

		String str = "This test";

		System.out.println("The string to be tested: " + str);

		if (isIn.test(str, "This"))
			System.out.println("'This' find");
		else
			System.out.println("'This' not find");

		if (isIn.test(str, "xyz"))
			System.out.println("'xyz' find");
		else
			System.out.println("'xyz' not find");
	}
}