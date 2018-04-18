package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 269
 * Subclass Triangle5
 */

public class TwoDShape4 {

	// Declare variables as private
	private double width;
	private double height;

	// Default constructor
	TwoDShape4() {
		width = height = 0.0;
	}

	// Parameterized constructor
	TwoDShape4(double w, double h) {
		width = w;
		height = h;
	}

	// Constructing an object with the same values for instance variables width,
	// height
	TwoDShape4(double x) {
		width = height = x;
	}

	// Create one object based on another
	TwoDShape4(TwoDShape4 ob) {
		width = ob.width;
		height = ob.height;
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
		System.out.println("Width and heigth - " + width + " и " + height);
	}
}