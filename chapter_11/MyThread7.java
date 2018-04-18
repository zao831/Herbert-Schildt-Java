package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 424
 * Executing ThreadCorn
 */

public class MyThread7 implements Runnable {
	
	Thread thrd;
	TickTock ttOb;

	// Create a new thread
	public MyThread7(String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start(); // start thread
	}

	// Start a new thread
	@Override
	public void run() {
		if (thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++)
				ttOb.tick(true);
			ttOb.tick(false);
		} else {
			for (int i = 0; i < 5; i++)
				ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}