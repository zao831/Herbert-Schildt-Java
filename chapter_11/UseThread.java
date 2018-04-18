package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 401
 */

public class UseThread {
	
	public static void main(String[] args) {

		System.out.println("Starting the main thread");

		// First, create an object of type MyThread
		MyThread mt = new MyThread("Child #1");

		// Then, create a thread based on this object
		Thread newThrd = new Thread(mt);

		// Start executing the thread
		newThrd.start();

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main stream interruption");
			}
		}
		System.out.println("Finishing the main stream");
	}
}