package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 404
 * Executing UseThread2
 */

public class MyThread2 implements Runnable {

	Thread thrd; // This variable stores a stream reference

	// Create new stream
	public MyThread2(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	// Start a new thread
	@Override
	public void run() {
		System.out.println(thrd.getName() + " - starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", counter " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " - Interrupted");
		}
		System.out.println(thrd.getName() + " - Completion");
	}
}