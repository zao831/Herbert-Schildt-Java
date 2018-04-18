package chapter_05.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 202
 * Questions and exercises 
 * for self-examination
 * Question number 4
 */

public class StrBubble {

	public static void main(String[] args) {

		String[] strs = { "this", "is", "a", "test", "of", "a", "string", "sort" };
		int a, b;
		String t;
		int size;

		size = strs.length;

		// Display original array
		System.out.print("Original array: ");
		for (int i = 0; i < size; i++)
			System.out.print(strs[i] + " ");
		System.out.println();

		// Bubble sorting strings
		for (a = 1; a < size; a++)
			for (b = size - 1; b >= a; b--)
				if (strs[b - 1].compareTo(strs[b]) > 0) {
					t = strs[b - 1];
					strs[b - 1] = strs[b];
					strs[b] = t;
				}

		// Display sorting array
		System.out.print("Sorting array: ");
		for (int i = 0; i < size; i++)
			System.out.print(strs[i] + " ");
		System.out.println();

	}
}