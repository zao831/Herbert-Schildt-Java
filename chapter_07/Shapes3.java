package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 254
 */

public class Shapes3 {

	public static void main(String[] args) {

		Triangle2 t1 = new Triangle2("Painted", 4.0, 4.0);
		Triangle2 t2 = new Triangle2("Contour", 8.0, 12.0);

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