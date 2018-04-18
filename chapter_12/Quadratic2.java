package chapter_12;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 458
*/

public class Quadratic2 {

	// Using static imports to place the sqrt () and pow () methods in the
	// visibility area
	public static void main(String[] args) {

		// a, b and c are the coefficients of the quadratic equation ax2 + bx + c = 0
		double a, b, c, x;

		// Solve the quadratic equation 4x2 + x - 3 = 0
		a = 4;
		b = 1;
		c = -3;

		// Find first root
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First root: " + x);

		// Find second root
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second root: " + x);
	}
}