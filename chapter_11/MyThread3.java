package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 405
 * Exercise 11.1
 * Executing ExtendThread
 */

public class MyThread3 extends Thread {

	// Create new stream
	public MyThread3(String name) {
		super(name); // Name the thread
		start(); // Start the thread
	}

	// Start a new thread
	@Override
	public void run() {
		System.out.println(getName() + " - starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", counter " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + " - Interrupted");
		}
		System.out.println(getName() + " - Completion");
	}
}