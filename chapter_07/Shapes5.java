package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 258
 */

public class Shapes5 {

	public static void main(String[] args) {

		Triangle4 t1 = new Triangle4();
		Triangle4 t2 = new Triangle4("Contour", 8.0, 12.0);
		Triangle4 t3 = new Triangle4(4.0);

		t1 = t2;

		System.out.println("Information about t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area - " + t1.area());

		System.out.println();

		System.out.println("Information about t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area - " + t2.area());

		System.out.println();

		System.out.println("Information about t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area - " + t3.area());

	}
}