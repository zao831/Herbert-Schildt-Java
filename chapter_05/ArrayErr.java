package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 163
 * Demonstrate exceeding of array boundaries
 */

public class ArrayErr {

	public static void main(String[] args) {

		int[] sample = new int[10];
		int i;

		for (i = 0; i < 100; i++) {

			sample[i] = i;
			System.out.print(sample[i] + " ");

		}
	}
}