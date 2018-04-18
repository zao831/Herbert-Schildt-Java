package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 226
 * Executable - Recursion
 */

public class Factorial {

	// Recursive method
	int factR(int n) {
		int result;

		if (n == 1)
			return 1;
		result = factR(n - 1) * n;
		return result;
	}

	// Iterative method
	int factI(int n) {
		int t, result;

		result = 1;
		for (t = 1; t <= n; t++)
			result *= t;
		return result;
	}
}