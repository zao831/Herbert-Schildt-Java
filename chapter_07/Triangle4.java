package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 256, 264
 * Super class TwoDShape3
 * Subclass ColorTriangle
 * Executing Shapes5, Shapes6
 */

public class Triangle4 extends TwoDShape3 {

	private String style;

	// КDefault constructor
	public Triangle4() {
		super(); // invoke the superclass constructor
		style = "none";
	}

	Triangle4(String s, double w, double h) {
		super(w, h); // call a superclass constructor with two arguments
		style = s;
	}

	// A constructor with one argument
	Triangle4(double x) {
		super(x); // call the superclass constructor
		style = "painted";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle " + style);

	}
}