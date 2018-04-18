package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 510
 * The same interface is used with three different lambda expressions
 */

public class LambdaDemo2_0 {

	public static void main(String[] args) {

		// This lambda-expression checks whether to divide one number into another
		// without a remainder
		NumericTest isFactor = (n, d) -> (n % d) == 0;

		if (isFactor.test(10, 2))
			System.out.println("2 is a divisor of 10");
		if (!isFactor.test(10, 3))
			System.out.println("3 isn't a divisor of 10");
		System.out.println();

		// This lambda expression returns true if the first argument is less than the
		// second argument
		NumericTest lessThan = (n, m) -> (n < m);
		if (lessThan.test(2, 10))
			System.out.println("2 less than 10");
		if (!lessThan.test(10, 2))
			System.out.println("10 is not less than 2");
		System.out.println();

		// This lambda expression returns true if both arguments are equal in absolute
		// value
		NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
		if (absEqual.test(4, -4))
			System.out.println("The absolute values of 4 and -4 are equal");
		if (!lessThan.test(4, -5))
			System.out.println("The absolute values of 4 and -5 are not equal");
	}
}