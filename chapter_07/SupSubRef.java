package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 268
 */

public class SupSubRef {

	public static void main(String[] args) {

		X1 x = new X1(10);
		X1 x2;
		Y1 y = new Y1(5, 6);

		x2 = x; // It is permissible, since both variables of the same type
		System.out.println("x2.a " + x2.a);

		x2 = y; // It is still possible, since Y1 is extends to X1

		// In the class X1 only members of the class X1

		x2.a = 19; // permissible

		// x2.b = 27; // error, because the variable is not a member of the class X

		System.out.println("x2.a " + x2.a);

		System.out.println("y.a " + y.a + "\ny.b " + y.b);

	}
}