package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 415
 */

public class PriorityDemo {
	
	public static void main(String[] args) {

		Priority mt1 = new Priority("High Priority");
		Priority mt2 = new Priority("Low Priority");

		// Set priorities
		mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

		// Run thread
		mt1.thrd.start();
		mt2.thrd.start();

		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main stream interruption");
		}
		System.out.println("\nCounter thread High Priority: " + mt1.count);
		System.out.println("Counter thread Low Priority: " + mt2.count);
	}
}