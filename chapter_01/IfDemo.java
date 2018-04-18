package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 47
 * Demonstration of the use of if operator
 */

public class IfDemo {

	public static void main(String[] args) {
		
		int a, b, c;
		a = 2;
		b = 3;

		if (a < b)
			System.out.println("a is less than b");
		if (a == b)
			System.out.println("This text will not be displayed");
		System.out.println();

		c = a - b; // c = -1

		System.out.println("c contains -1");
		if (c > 0)
			System.out.println("c - nonnegative number");
		if (c < 0)
			System.out.println("c - negative number");
		System.out.println();

		c = b - a; // c = 1

		System.out.println("c contains 1");
		if (c > 0)
			System.out.println("c - nonnegative number");
		if (c < 0)
			System.out.println("c - negative number");
		
	}
}