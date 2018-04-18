package chapter_05.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 202
 * Questions and exercises 
 * for self-examination
 * Question number 3
 */

public class ArithMean {

	public static void main(String[] args) {

		double[] t = new double[10];
		double sum = 0;

		// Arbitrarily initialize an array
		for (int i = 0; i < t.length; i++)
			t[i] = i + 1;

		// Display array
		for (double x : t) {
			
			System.out.print(x + ", ");
			sum += x;
			
		}
		
		System.out.print("\nArithmetical mean: ");
		System.out.println(sum / t.length);
		
	}
}