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

public class FactorialLambdaDemo {

	public static void main(String[] args) {

		// This block lambda-expression calculates the factorial of the integer value
		NumericFunc factorial = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++)
				result *= i;
			return result;
		};

		System.out.println("The factorial of the number 3 is " + factorial.func(3));
		System.out.println("The factorial of the number 5 is " + factorial.func(5));
		System.out.println("The factorial of the number 9 is " + factorial.func(9));
	}
}