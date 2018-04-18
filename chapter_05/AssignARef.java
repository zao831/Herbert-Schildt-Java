package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 170
 * Assigning references to arrays
 */

public class AssignARef {

	public static void main(String[] args) {

		int i;

		int[] nums1 = new int[10];
		int[] nums2 = new int[10];

		for (i = 0; i < 10; i++)
			nums1[i] = i;

		for (i = 0; i < 10; i++)
			nums2[i] = -i;

		System.out.print("Array nums1: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + " ");

		System.out.print("\nArray nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");

		// Now let both variables refer to the same array
		nums2 = nums1;

		System.out.print("\nArray nums2 after assignment: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums2[i] + " ");

		// We perform operations on the array nums1 through the variable nums2
		nums2[3] = 99;

		System.out.print("\nArray nums1 after changing through nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(nums1[i] + " ");

	}
}