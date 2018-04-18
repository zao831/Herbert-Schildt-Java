package chapter_07.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 288
 * Questions and exercises 
 * for self-examination
 * Question number 2
 */

public class CircleDemo {

	public static void main(String[] args) {
		
		Circle ob = new Circle(5);
		
		System.out.println("The area of a circle with radius " + ob.getWidth() + " is " + ob.area());
		
	}
}