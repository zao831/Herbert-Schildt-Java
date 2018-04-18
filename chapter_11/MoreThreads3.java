package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 411
 */

public class MoreThreads3 {
	
	public static void main(String[] args) {

		System.out.println("Starting the main stream");

		// Running a stream when it is created
		MyThread4 mt1 = new MyThread4("Child #1");
		MyThread4 mt2 = new MyThread4("Child #2");
		MyThread4 mt3 = new MyThread4("Child #3");

		try {
			mt1.thrd.join();
			System.out.println("Child #1 - appened");
			mt2.thrd.join();
			System.out.println("Child #2 - appened");
			mt3.thrd.join();
			System.out.println("Child #3 - appened");
		} catch (InterruptedException exc) {
			System.out.println("Main stream interruption");
		}
		System.out.println("Finishing the main stream");
	}
}