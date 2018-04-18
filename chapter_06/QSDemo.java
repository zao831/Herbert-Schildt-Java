package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 233
 * Exercise 6.3
 */

public class QSDemo {

	public static void main(String[] args) {

		char[] a = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
		int i;

		System.out.print("Source array: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i]);

		System.out.println();

		// Sorted array
		Quicksort.qsort(a);

		System.out.print("Sorted array: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i]);

	}
}