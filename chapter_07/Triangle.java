package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 249
 * Super class TwoDShape
 * Executing Shapes
 */

public class Triangle extends TwoDShape {

	String style;

	double area() {
		return width * height / 2;
	}

	void showStyle() {
		System.out.println("Triangle " + style);

	}
}