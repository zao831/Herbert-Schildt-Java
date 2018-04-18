package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 524
 * Associated class MethodRefDemo
 * This class defines three static methods that check the correspondence of an integer to certain conditions
 */

public class MyintPredicates {

	// Static method that return true, if the current number is prime
	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / i; i++) {
			if ((n % i) == 0)
				return false;
		}
		return true;
	}

	// Static method that return true, if the current number is even
	static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	// Static method that return true, if the current number is a positive
	static boolean isPositive(int n) {
		return n > 0;
	}
}