package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 408
 * Executing MoreThreads, MoreThreads2,
 * MoreThreads3
 */

public class MyThread4 implements Runnable {

	Thread thrd; // This variable stores a stream reference

	// Create new stream
	public MyThread4(String name) {
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