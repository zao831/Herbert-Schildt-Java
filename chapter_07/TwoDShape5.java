package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 277
 * Subclass Triangle6, Rectangle1
 */

public class TwoDShape5 {

	// Declare variables as private
	private double width;
	private double height;
	private String name;

	// Default constructor
	TwoDShape5() {
		width = height = 0.0;
		name = "none";
	}

	// Parameterized constructor
	TwoDShape5(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	// Constructing an object with the same values for instance variables width,
	// height
	TwoDShape5(double x, String n) {
		width = height = x;
		name = n;
	}

	// Create one object based on another
	TwoDShape5(TwoDShape5 ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
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

	String getName() {
		return name;
	}

	void showDim() {
		System.out.println("Width и Height - " + width + " и " + height);
	}

	double area() {
		System.out.println("The area() method must be redefined");
		return 0.0;
	}
}