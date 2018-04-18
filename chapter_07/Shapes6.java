package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 265
 */

public class Shapes6 {

	public static void main(String[] args) {

		ColorTriangle t1 = new ColorTriangle("Blue", "Contour", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Red", "painted", 2.0, 2.0);

		System.out.println("Information about t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area - " + t1.area());

		System.out.println();

		System.out.println("Information about t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area - " + t2.area());

	}
}