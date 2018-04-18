package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 513
 */

public class BlockLamЬdaDemo {

	public static void main(String[] args) {

		// lambda expression containing a block of code returns the smallest positive
		// divisor of a given integer
		NumericFunc smallestF = (n) -> {
			int result = 1;

			// Get absolute value of n
			n = n < 0 ? -n : n;

			for (int i = 2; i <= n / i; i++)
				if ((n % i) == 0) {
					result = i;
					break;
				}
			return result;
		};

		System.out.println("The smallest divisor 12 is: " + smallestF.func(12));
		System.out.println("The smallest divisor 11 is: " + smallestF.func(11));

	}
}