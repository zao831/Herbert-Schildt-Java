package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 228
 * using a static variable
 * Executable - SDemo
 */

public class StaticDemo {

	int x; // Ordinary variable
	static int y; // Static variable

	// Return a values sum
	int sum() {
		return x + y;
	}
}