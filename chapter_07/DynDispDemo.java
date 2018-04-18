package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 275
 */

public class DynDispDemo {

	public static void main(String[] args) {

		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();

		Sup supRef;

		// In each of these calls, the version of the who () method is selected by the
		// type of the object the link points to during the call
		supRef = superOb;
		supRef.who();

		supRef = subOb1;
		supRef.who();

		supRef = subOb2;
		supRef.who();

	}
}