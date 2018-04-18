package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 429
 * Executing Suspend
 */

public class MyThread8 implements Runnable {
	Thread thrd;

	volatile boolean suspended;
	volatile boolean stopped;

	// Create a new thread
	public MyThread8(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}

	// Stream entry point
	@Override
	public void run() {
		System.out.println(thrd.getName() + " - start");
		try {
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}

				synchronized (this) {
					while (suspended) {
						wait();
					}
					if (stopped)
						break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " - interrupted");
		}
		System.out.println(thrd.getName() + " - exit");
	}

	// Stop the stream
	synchronized void mystop() {
		stopped = true;

		// The next operators a complete stop of the suspended stream
		suspended = false;
		notify();
	}

	// Suspend stream
	synchronized void mysuspend() {
		suspended = true;
	}

	// Resume stream
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}