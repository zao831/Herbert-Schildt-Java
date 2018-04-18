package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 416
 */

public class SumArray {
	
	private int sum;

	synchronized int sumArray(int[] nums) {
		sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("The current value of the amount for " + Thread.currentThread().getName() + ": " + sum);

			try {
				Thread.sleep(10); // Enable task switching
			} catch (InterruptedException exc) {
				System.out.println("Main thread interruption");
			}
		}
		return sum;
	}
}