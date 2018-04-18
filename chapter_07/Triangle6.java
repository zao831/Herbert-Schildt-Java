package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 278
 * Super class TwoDShape5
 * Executing DynShapes
 */

public class Triangle6 extends TwoDShape5 {
	
	private String style;

	// Default constructor
	public Triangle6() {
		super();
		style = "none";
	}

	// The Triangle6 class constructor
	Triangle6(String s, double w, double h) {
		super(w, h, "triangle"); // invoke the superclass constructor
		style = s;
	}

	// A constructor with one argument for building a triangle
	Triangle6(double x) {
		super(x, "triangle"); // invoke the superclass constructor
		style = "painted";
	}

	// Create one object based on another
	Triangle6(Triangle6 ob) {
		super(ob); // passing object to the TwoDShape5 class constructor
		style = ob.style;
	}

	// Overriding the area () method for the Triangle6 class
	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle " + style);
	}
}