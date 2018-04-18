package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 430
 */

public class Suspend {
	
	public static void main(String[] args) {

		MyThread8 ob1 = new MyThread8("My Thread");

		try {
			Thread.sleep(1000); // Let stream begin execution

			ob1.mysuspend();
			System.out.println("Suspend stream");
			Thread.sleep(1000);

			ob1.myresume();
			System.out.println("Resume stream");
			Thread.sleep(1000);

			ob1.mysuspend();
			System.out.println("Suspend stream");
			Thread.sleep(1000);

			ob1.myresume();
			System.out.println("Resume stream");
			Thread.sleep(1000);

			ob1.mysuspend();
			System.out.println("Stop stream");
			ob1.mystop();
		} catch (InterruptedException exc) {
			System.out.println("Interrupted main stream");
		}

		// Wait for thread to end
		try {
			ob1.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Interrupted main stream");
		}

		System.out.println("Exit mian stream");
	}
}