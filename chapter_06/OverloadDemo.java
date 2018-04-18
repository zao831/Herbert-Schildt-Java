package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 217
 */

public class OverloadDemo {

	public static void main(String[] args) {

		Overload ob = new Overload();
		int resI;
		double resD;

		// Alternately call all versions of the method ovlDemo()
		ob.ovlDemo();
		System.out.println();

		ob.ovlDemo(2);
		System.out.println();

		resI = ob.ovlDemo(4, 6);
		System.out.println("Call result ob.ovlDemo(4, 6): " + resI);
		System.out.println();

		resD = ob.ovlDemo(1.1, 2.32);
		System.out.println("Call result ob.ovlDemo(1.1, 2.32): " + resD);
		System.out.println();

		ob.ovlDemo(2, 5);
		System.out.println();

		ob.ovlDemo(2.2, 5.1);
		System.out.println();

	}
}