package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 342
 * Using a specially crafted exception
 * Executing CustomExceptDemo
 */

@SuppressWarnings("serial") // Suppressing the compiler warning
public class NonIntResultException extends Exception { // Create an exception

	int n;
	int d;

	NonIntResultException(int i, int j) {
		this.n = i;
		this.d = j;
	}

	@Override
	public String toString() {
		return "The result of the operation " + n + " / " + d + " is not an integer";
	}
}