package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 249
 */

public class Shapes {

	public static void main(String[] args) {

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		// Objects of type Triangle are available to all members of the Triangle class,
		// even those that are inherited from the TwoDShare class
		
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "Painted";

		t2.width = 8.0;
		t2.height = 12.0;
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