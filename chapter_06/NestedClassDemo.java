package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 236
 */

public class NestedClassDemo {

	public static void main(String[] args) {

		int[] x = { 3, 2, 1, 5, 6, 9, 7, 8 };

		Outer outOb = new Outer(x);

		outOb.Analyse();

	}
}
