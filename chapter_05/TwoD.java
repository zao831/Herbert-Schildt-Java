package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 166
 * Demonstration of a two-dimensional array
 * Added counting iteration cycles
 */

public class TwoD {

	public static void main(String[] args) {

		int t, i;
		int count1 = 0, count2 = 0;
		int[][] table = new int[3][4];

		for (t = 0; t < 3; t++) {

			count1++;
			for (i = 0; i < 4; i++) {
				table[t][i] = (t * 4) + i + 1;
				System.out.print(table[t][i] + " ");
				count2++;

			}
			System.out.println();

		}

		System.out.println("\nArray filling complete" + "\ncount1: " + count1 + "\ncount2: " + count2);

	}
}