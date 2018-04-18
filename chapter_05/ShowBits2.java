package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 199
 * Exercise 5.3
 * Creating a class to display values in binary form 
 * Execute ShowBitsDemo class
 */

public class ShowBits2 {

	int numbits;

	public ShowBits2(int n) {
		numbits = n;
	}

	void show(long val) {
		long mask = 1;

		// Move value 1 to the left to the desired position
		mask <<= numbits - 1;

		int spacer = 0;
		for (; mask != 0; mask >>>= 1) {

			if ((val & mask) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			spacer++;
			if ((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}

		}

		System.out.println();

	}
}