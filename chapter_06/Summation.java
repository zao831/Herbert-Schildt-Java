package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 222
 * Initializing one object by another
 * Executable - SumDemo class
 */

public class Summation {
	
	int sum;

	// Create an object based on the integer value
	Summation(int num) {
		sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
	}

	// Create one object based on another
	Summation(Summation ob) {
		sum = ob.sum;
	}
}