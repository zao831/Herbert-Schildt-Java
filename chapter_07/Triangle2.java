package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 254
 * Super class TwoDShape1
 * Executing Shapes3
 */

public class Triangle2 extends TwoDShape1 {

	private String style;

	// Constructor
	public Triangle2(String s, double w, double h) {
		setWidth(w);
		setHeight(h);
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle " + style);

	}
}