package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 256
 * Subclass Triangle3
 */

public class TwoDShape2 {

	// Declare variables as private
	private double width;
	private double height;

	// Parameterized constructor
	TwoDShape2(double w, double h) {
		width = w;
		height = h;
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