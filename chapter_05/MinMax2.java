package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 163
 * Applying array initializers
 * Added counting iteration cycles
 */

public class MinMax2 {

	public static void main(String[] args) {

		int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		int min, max;
		int iternum = 1; // iteration number

		min = max = nums[0]; // min = max = 99;

		System.out.println("min and max: " + min + "; " + max + "\n");
		System.out.println("The iteration starts\n\n");

		for (int i = 1; i < 10; i++) {

			System.out.println("iteration number: " + iternum + "; nums[" + i + "] = " + nums[i] + ";");

			if (nums[i] < min)
				min = nums[i];
			if (nums[i] > max)
				max = nums[i];

			System.out.println("min and max: " + min + "; " + max + ";\n");
			iternum++;
		}

		System.out.println("\nThe result min" + " and max: " + min + "; " + max + ";");

	}
}