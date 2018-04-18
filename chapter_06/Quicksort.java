package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 233
 * Exercise 6.3
 * A simple version of Quiksort that implements fast sorting
 * Executable - QSDemo
 */

public class Quicksort {

	// Organize a call to the actual Hoar sorting method
	static void qsort(char[] items) {
		qs(items, 0, items.length - 1);
	}

	// Recursive version of fast sorting of characters
	private static void qs(char[] items, int left, int right) {
		int i, j;
		char x, y;

		i = left;
		j = right;
		x = items[(left + right) / 2];

		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;

			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i < j);

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}
}