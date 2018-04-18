package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 69
 * Demonstration of dynamic initialization
 */

public class DynInit {

	public static void main(String args[]) {
		double radius = 4, height = 5;

		// The "volume" variable is initialized dynamically during program execution
		double volume = 3.1416 * radius * radius * height;

		System.out.println("Volume: " + volume);
	}

}
