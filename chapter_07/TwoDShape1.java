package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 252
 * Subclass Triangle1, Triangle2
 */

public class TwoDShape1 {

	// Declare variables as private
	private double width;
	private double height;

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