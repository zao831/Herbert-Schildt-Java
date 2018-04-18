package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 63
 * Demonstration of the use of logical values
 */

public class BoolDemo {

	public static void main(String[] args) {
		boolean b;

		b = false;
		System.out.println("Value b: " + b);
		b = true;
		System.out.println("Value b: " + b);

		// A boolean value can be used to control a conditional operator if
		if (b)
			System.out.println("This instruction is executed");

		b = false;
		if (b)
			System.out.println("This instruction is not executed");

		// As a result of the comparison, a logical value is obtained
		System.out.println("Comparison result is 10 > 9: " + (10 > 9));

	}

}
