package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 171
 * Using the length variable to copy arrays
 */

public class ACopy {

	public static void main(String[] args) {

		int i;
		int[] nums1 = new int[10];
		int[] nums2 = new int[10];

		for (i = 0; i < nums1.length; i++)
			nums1[i] = i;

		System.out.print("nums1: ");
		for (i = 0; i < nums1.length; i++)
			System.out.print(nums1[i] + " ");

		// Copy array nums1 to nums2
		if (nums2.length >= nums1.length)
			for (i = 0; i < nums2.length; i++)
				nums2[i] = nums1[i];

		System.out.print("\nnums2: ");
		for (i = 0; i < nums2.length; i++)
			System.out.print(nums2[i] + " ");

	}
}