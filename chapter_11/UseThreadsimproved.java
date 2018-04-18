package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 404
 */

public class UseThreadsimproved {
	
	public static void main(String[] args) {

		System.out.println("Starting the main thread");

		// Running a stream when it is created
		@SuppressWarnings("unused")
		MyThread2 mt = new MyThread2("Child #1");

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