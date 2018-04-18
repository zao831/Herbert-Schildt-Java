package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 231
 * Creating incorrect code
 */

public class StaticError {
	
	int denom = 3; // Ordinary variable
	static int val = 1024; // Static variable

	// Error! Non-static variables can not be accessed from a static method

	// static int valDivDenom() {
	// return val / denom; // Error
	// }
}
