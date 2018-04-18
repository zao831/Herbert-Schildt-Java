package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 420
 */

public class SumArray2 {
	
	private int sum;

	int sumArray(int[] nums) {
		sum = 0; // Reset sum

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("The current value of the amount for " + Thread.currentThread().getName() + ": " + sum);

			try {
				Thread.sleep(1000); // Enable task switching
			} catch (InterruptedException exc) {
				System.out.println("Main thread interruption");
			}
		}
		return sum;
	}
}