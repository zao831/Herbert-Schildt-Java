package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 257, 263
 * Subclass Triangle4
 */

public class TwoDShape3 {

	// Declare variables as private
	private double width;
	private double height;

	// Default constructor
	TwoDShape3() {
		width = height = 0.0;
	}

	// Parameterized constructor
	TwoDShape3(double w, double h) {
		width = w;
		height = h;
	}

	// constructing an object with the same values for the instance variables width
	// and height
	TwoDShape3(double x) {
		width = height = x;
	}

	// Creating methods for accessing private variables width, height
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Width and height - " + width + " и " + height);
	}
}