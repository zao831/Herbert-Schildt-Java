package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 213
 */

public class CallByRef {

	public static void main(String arg[]) {

		Test2 ob = new Test2(15, 20);

		System.out.println("ob.a и ob.b before calling: " + ob.a + " " + ob.b); // 15, 20

		ob.change(ob);

		System.out.println("ob.a и ob.b after calling: " + ob.a + " " + ob.b); // 35, -20

	}
}