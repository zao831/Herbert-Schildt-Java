package chapter_07.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 288
 * Questions and exercises 
 * for self-examination
 * Question number 2
 * Super class TwoDShape
 * Executable CircleDemo
 */

public class Circle extends TwoDshape {

	Circle(double x) {
		super(x);
	}

	double area() {
		return Math.pow(getWidth(), 2) * 3.1415;
	}
}