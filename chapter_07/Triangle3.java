package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 256
 * Super class TwoDShape2
 * Executing Shapes4
 */

public class Triangle3 extends TwoDShape2 {

	private String style;

	// Constructor with two arguments
	Triangle3(String s, double w, double h) {
		super(w, h); // invoke the superclass constructor
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle " + style);

	}
}