package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 106
 * Declaring a cycle variable in the "for" cycle itself
 */

public class ForVar {

	public static void main(String[] args) {
		
		int sum = 0;
		int fact = 1;

		// Calculating the factorial of numbers from 1 to 5
		for (int i = 1; i <= 5; i++) { // The variable "i" is declared in the "for" operator itself

			sum += i;
			fact *= i;

		}

		// Outside the "for" operator, the variable "i" is not available

		System.out.println("Summ: " + sum);
		System.out.println("Factorial: " + fact);

	}
}
