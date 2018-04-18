package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 273
 */

public class Overload {

	public static void main(String[] args) {

		B4 subOb = new B4(1, 2, 3);

		// Call show() method from B4 class
		subOb.show("K: ");

		// Call show() method from A2 class
		subOb.show();

	}
}