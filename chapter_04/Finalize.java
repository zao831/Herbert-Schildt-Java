package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 154
 * Exercise 4.2
 * Demonstration of garbage collection and the finalize() method
 */

public class Finalize {

	public static void main(String[] args) {
		
		int count;

		FDemo ob = new FDemo(0);

		// A large number of objects are generated. At some point in time, garbage
		// collection should begin
		for (count = 1; count < 100000; count++)
			ob.generator(count);

	}
}