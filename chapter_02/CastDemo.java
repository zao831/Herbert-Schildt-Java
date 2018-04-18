package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 82
 * Demonstration bringing one type to another
 */

public class CastDemo {

	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;

		x = 10.0;
		y = 3.0;
		i = (int) (x / y); // bringing double to int

		// The fractional part of the number is lost
		System.out.println("The integer result of dividing x / y: " + i);

		i = 100;
		b = (byte) i; // byte -128 : 127 => (b = 100) - true;
		System.out.println("Value b: " + b);

		i = 257;
		b = (byte) i; // Information is lost byte can not contain the number 257
		System.out.println("Значение b: " + b);

		b = 88; // X in the code ASCII
		ch = (char) b; // Explicit bringing of incompatible types
		System.out.println("ch: " + ch);
	}
}
