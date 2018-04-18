package chapter_14.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 8
 */

public class FactorialGen {

	public static void main(String[] args) {

		// This block lambda-expression calculates the factorial of the integer value
		MyFunc<Integer> factNum = (n) -> {
			int result = 1;
			for (int i = n; i > 0; i--) {
				result *= i;
			}
			return result;
		};

		System.out.println("The factorial of the number 5 is " + factNum.func(5));
		System.out.println(FactorialGen.class);
	}
}