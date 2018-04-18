package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 154
 * Exercise 4.2
 * Demonstration of garbage collection and the finalize() method
 * Execute Finalize class
 */

public class FDemo {
	int x;

	public FDemo(int i) {
		x = i;
	}

	// Called when an object is deleted
	protected void finalize() {
		System.out.println("Finalize " + x);
	}

	// Generates an object that is immediately deleted
	void generator(int i) {
		FDemo o = new FDemo(i);
		System.out.println(o);
	}
}