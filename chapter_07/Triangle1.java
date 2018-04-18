package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 253
 * Super class TwoDShape1
 * Executing Shapes1
 */

public class Triangle1 extends TwoDShape1 {

	String style;

	double area() {
		return getWidth() * getHeight() / 2;
		// double a = width * height / 2;
		// return a;
	}

	void showStyle() {
		System.out.println("Triangle " + style);

	}
}