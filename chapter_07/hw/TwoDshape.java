package chapter_07.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 288
 * Questions and exercises 
 * for self-examination
 * Question number 2
 * Subclass - Circle
 */

public class TwoDshape {

	private double width;
	private double height;

	TwoDshape() {
		width = height = 0;
	}

	TwoDshape(double x) {
		width = height = x;
	}

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

	double area() {
		System.out.println("The area () method must be redefined");
		return 0.0;
	}
}