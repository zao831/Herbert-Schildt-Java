package chapter_02.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 88
 * Questions and exercises for self-examination
 * Question number 11
 * Finding primes from 2 to 100
*/

public class Prime {

	public static void main(String[] args) {
		
		int i, j, count1 = 0, count2 = 0;
		boolean isprime;

		for (i = 2; i < 100; i++) {
			isprime = true;
			count1++;
			System.out.println("count1: " + count1 + ", i = " + i);

			// Check if the number is divided without a remainder
			for (j = 2; j <= i / j; j++) {

				// If the number is divisible without a remainder, it is simple
				count2++;
				System.out.println("count2: " + count2 + ", j = " + j);
				if (i % j == 0)
					isprime = false;

				if (isprime)
					System.out.println(i + " - prime number");

			}
		}
	}
}
