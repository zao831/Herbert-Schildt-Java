package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 408
 */

public class MoreThreads {
	
	public static void main(String[] args) {

		System.out.println("Starting the main stream");

		// Running a stream when it is created
		@SuppressWarnings("unused")
		MyThread4 mt1 = new MyThread4("Child #1");

		@SuppressWarnings("unused")
		MyThread4 mt2 = new MyThread4("Child #2");

		@SuppressWarnings("unused")
		MyThread4 mt3 = new MyThread4("Child #3");

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