package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 401
 * Executing UseThread
 */

public class MyThread implements Runnable {

	String thrdName;

	public MyThread(String name) {
		thrdName = name;
	}

	// The entry point into stream
	@Override
	public void run() {
		System.out.println(thrdName + " - starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + ", counter " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrdName + " - Interrupted");
		}
		System.out.println(thrdName + " - Completion");
	}
}