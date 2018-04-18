package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 77
 * Demonstration of the use of shortened logical operations
 */

public class SCops {

	public static void main(String[] args) {
		
		int n, d;

		n = 10;
		d = 2;
		if (d != 0 && (n % d) == 0)
			System.out.println("1: " + d + " is a divisor " + n + "\n");

		d = 0; // Set the zero value

		// The second operand is not calculated, since the value of "d" is zero

		if (d != 0 && (n % d) == 0)
			System.out.println("2: " + d + " is a divisor " + n);

		// Now, the same actions are performed without using a shortened logical
		// operator. As a result, there will be an error "division by zero"

		if (d != 0 & (n % d) == 0)
			System.out.println("3: " + d + " is a divisor " + n);

	}
}
