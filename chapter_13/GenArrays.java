package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 499
 */

public class GenArrays {

	public static void main(String[] args) {

		Integer[] n = { 1, 2, 3, 4, 5 };

		@SuppressWarnings("unused")
		Gen2<Integer> iOb = new Gen2<Integer>(50, n);

		// It is not possible to create an array of generalized references to objects of
		// a particular type

		// Gen2<Integer>[] gens = new Gen2<Integer>[10]; // Error

		// The next expression is admissible
		@SuppressWarnings("unused")
		Gen2<?>[] gens = new Gen2<?>[10];
	}
}