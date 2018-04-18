package chapter_14.hw;

import chapter_14.NumericFunc;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 7
 */

public class FactorialInt {

	public static void main(String[] args) {

		// This block lambda-expression calculates the factorial of the integer value
		NumericFunc factNum = (n) -> {
			int result = 1;
			for (int i = n; i > 0; i--) {
				result *= i;
			}
			return result;
		};

		System.out.println("The factorial of the number 5 is " + factNum.func(5));
		System.out.println("The factorial of the number 6 is " + factNum.func(6));
		System.out.println("The factorial of the number 8 is " + factNum.func(8));
	}
}