package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 410
 */

public class MoreThreads2 {
	
	public static void main(String[] args) {

		System.out.println("Starting the main stream");

		// Running a stream when it is created
		MyThread4 mt1 = new MyThread4("Child #1");
		MyThread4 mt2 = new MyThread4("Child #2");
		MyThread4 mt3 = new MyThread4("Child #3");

		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main stream interruption");
			}
		} while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive()); // Waiting for all threads to complete
		System.out.println("Finishing the main stream");
	}
}