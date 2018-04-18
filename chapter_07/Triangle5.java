package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 270
 * Super class TwoDShape4
 * Executing Shapes7
 */

public class Triangle5 extends TwoDShape4 {

	private String style;

	// Default constructor
	public Triangle5() {
		super();
		style = "none";
	}

	// The Triangle5 class constructor
	Triangle5(String s, double w, double h) {
		super(w, h); // invoke the superclass constructor
		style = s;
	}

	// A constructor with one argument for building a triangle
	Triangle5(double x) {
		super(x); // invoke the superclass constructor
		style = "painted";
	}

	// Create one object based on another
	Triangle5(Triangle5 ob) {
		super(ob); // passing object to the TwoDShape4 class constructor
		style = ob.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle " + style);
	}
}