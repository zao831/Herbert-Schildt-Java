package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 267
 */

public class IncompatibleRef {

	public static void main(String[] args) {

		X x = new X(10);
		X x2;
		// Y y = new Y(5);

		x2 = x; // is valid since both variables of the same type
		System.out.println(x2.a);

		// x2 = y; // It is not valid since both variables of the same type

	}
}