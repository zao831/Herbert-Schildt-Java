package chapter_14.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 7
 */

public class FactorialLambdaDemo2 {

	public static void main(String[] args) {

		// This block lambda-expression calculates the factorial of the integer value
		MyFunc<Integer> factorial = (n) -> {
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