package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 278
 * Super class TwoDShape5
 * Executing DynShapes
 */

public class Rectangle1 extends TwoDShape5 {

	// Default constructor
	Rectangle1() {
		super();
	}

	// Rectangle1 class constructor
	Rectangle1(double w, double h) {
		super(w, h, "rectangle"); // invoke the superclass constructor
	}

	// Create a square
	Rectangle1(double x) {
		super(x, "rectangle"); // invoke the superclass constructor
	}

	// Create one object based on another
	Rectangle1(Rectangle1 ob) {
		super(ob); // passing object to the TwoDShape5 class constructor
	}

	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}

	double area() { // Override the method for class Rectangle1
		return getWidth() * getHeight();
	}
}