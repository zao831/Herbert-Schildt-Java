package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 216
 * Overload methods
 */

public class Overload {

	void ovlDemo() {
		System.out.println("Without parameters");
	}

	// Overload olvDemo() method for one parameter (int)
	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
	}

	// Overload olvDemo() method for two parameters (int)
	int ovlDemo(int a, int b) {
		System.out.println("Two parameters: " + a + ", " + b);
		return a + b;
	}

	// Overload olvDemo() method for two parameters (double)
	double ovlDemo(double a, double b) {
		System.out.println("Two parameters type double: " + a + ", " + b);
		return a + b;

	}
}