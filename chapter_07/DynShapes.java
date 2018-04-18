package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 279
 */

public class DynShapes {

	public static void main(String[] args) {

		TwoDShape5[] shapes = new TwoDShape5[5];

		shapes[0] = new Triangle6("Contour", 8.0, 12.0);
		shapes[1] = new Rectangle1(10);
		shapes[2] = new Rectangle1(10, 4);
		shapes[3] = new Triangle6(7.0);
		shapes[4] = new TwoDShape5(10, 20, "figure");

		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Object - " + shapes[i].getName());
			System.out.println("Area - " + shapes[i].area());
			System.out.println();
		}
	}
}