package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 421
 * Executing Sync
 */

public class MyThread6 implements Runnable {
	
	Thread thrd;
	static SumArray2 sa = new SumArray2();
	int[] a;
	int answer;

	// Create a new thread
	public MyThread6(String name, int[] nums) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start(); // start thread
	}

	// Start a new thread
	@Override
	public void run() {
		// int sum;

		System.out.println(thrd.getName() + " - start");

		synchronized (sa) {
			answer = sa.sumArray(a);
		}

		System.out.println("Sum for a " + thrd.getName() + ": " + answer);
		System.out.println(thrd.getName() + " - completion");

	}
}