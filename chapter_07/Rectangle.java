package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 249
 * Super class TwoDShape
 * Executable RectanDemo
 */

public class Rectangle extends TwoDShape {

	// The isSquare() method returns true if the rectangle is a square
	boolean isSquare() {
		if (width == height)
			return true;
		return false;
	}

	// Returns the area of a rectangle
	double area() {
		return width * height;
	}
}