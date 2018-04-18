package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 161
 * Demonstration of a one-dimensional array
 */

public class ArrayDemo {

	public static void main(String[] args) {

		int[] sample = new int[10];
		int i;

		for (i = 0; i < 10; i = i + 1)
			sample[i] = i;

		for (i = 0; i < 10; i = i + 1)
			System.out.println("Element[" + i + "]: " + sample[i]);

	}
}