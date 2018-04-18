package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 265
 * Subclass Triangle4
 * Executing Shapes6
 */

public class ColorTriangle extends Triangle4 {

	private String color;

	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("Color - " + color);
	}
}
