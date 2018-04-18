package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 421
 */

public class Sync2 {
	
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		MyThread6 mt1 = new MyThread6("Child #1", a);
		MyThread6 mt2 = new MyThread6("Child #2", a);

		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interruption");
		}
	}
}