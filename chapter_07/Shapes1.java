package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 253
 */

public class Shapes1 {

	public static void main(String[] args) {

		Triangle1 t1 = new Triangle1();
		Triangle1 t2 = new Triangle1();

		// Objects of type Triangle are available to all members of the Triangle class,
		// even those that are inherited from the TwoDShare class

		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "Painted";

		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "Contour";

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