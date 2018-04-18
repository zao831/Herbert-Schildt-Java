package chapter_11.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 434
 * Questions and exercises 
 * for self-examination
 * Question number 8
 */

public class MyThreadHw implements Runnable {

	Thread thrd;
	TickTockHw ttOb;

	// Create a new thread
	public MyThreadHw(String name, TickTockHw tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start();
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