package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 417
 * Executing Sync
 */

public class MyThread5 implements Runnable {
	
	Thread thrd;
	static SumArray sa = new SumArray();
	int[] a;
	int answer;

	// Create a new thread
	public MyThread5(String name, int[] nums) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start(); // start thread
	}

	// Start a new thread
	@Override
	public void run() {
		// int sum;

		System.out.println(thrd.getName() + " - start");

		answer = sa.sumArray(a);
		System.out.println("Sum for a " + thrd.getName() + ": " + answer);
		System.out.println(thrd.getName() + " - completion");

	}
}