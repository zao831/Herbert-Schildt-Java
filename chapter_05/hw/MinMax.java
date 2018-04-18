package chapter_05.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 202
 * Questions and exercises 
 * for self-examination
 * Question number 14
 */

public class MinMax {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int min, max;
		
		nums[0] = 99;
		nums[1] = -10;
		nums[2] = 100123;
		nums[3] = 18;
		nums[4] = -978;
		nums[5] = 5623;
		nums[6] = 463;
		nums[7] = -9;
		nums[8] = 287;
		nums[9] = 49;
		min = max = nums[0]; // min = max = 99;
		
		for(int x : nums) {
			
			if(x < min) min = x;
			if(x > max) max = x;
			
		}
		System.out.println("min: " + min + "\nmax: " + max);
			
	}
}