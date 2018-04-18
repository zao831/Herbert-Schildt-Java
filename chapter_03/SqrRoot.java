package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 102
 * Output of square roots of numbers from 1 to 99 together with a rounding error
 */

public class SqrRoot {

	public static void main(String[] args) {
		
		double num, sroot, rerr;

		for (num = 1.0; num < 100.0; num++) {
			
			sroot = Math.sqrt(num);
			System.out.println("The square root of " + num + " is equal to " + sroot);

			// Calculate rounding error
			rerr = num - (sroot * sroot);
			System.out.println("Rounding error: " + rerr);
			System.out.println();

		}
	}
}
