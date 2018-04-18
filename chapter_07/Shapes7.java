package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 270
 */

public class Shapes7 {

	public static void main(String[] args) {

		Triangle5 t1 = new Triangle5("contour", 8.0, 12.0);

		// Create a copy t1
		Triangle5 t2 = new Triangle5(t1);

		System.out.println("Information about t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area - " + t1.area());

		System.out.println();

		System.out.println("Information about t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area - " + t2.area());

	}
}