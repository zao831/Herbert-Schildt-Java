package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 81
 * Demonstration of automatic conversion of type long to type double
 */

public class LtoD {

	public static void main(String[] args) {
		long L;
		double D;

		L = 10012328L;
		D = L; // automatic conversion of type long to type double
		System.out.println("L и D: " + L + " / " + D);

		D = 100123285.0;
		// This line of code does not pass the compilation
		// L = D; // Error! type double can not be converted to long

		System.out.println("L и D: " + L + " / " + D);

	}
}
