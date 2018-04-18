package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 482
 * A example simple method generalized 
 */

public class GenericMethodDemo {

	// Determine whether the contents of two arrays are the same
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		// Arrays of different lengths can not be the same
		if (x.length != y.length)
			return false;

		for (int i = 0; i < x.length; i++)
			if (!x[i].equals(y[i]))
				return false; // Arrays are different
		return true; // The contents of the arrays are the same
	}

	public static void main(String[] args) {

		Integer[] nums = { 1, 2, 3, 4, 5 };
		Integer[] nums2 = { 1, 2, 3, 4, 5 };
		Integer[] nums3 = { 1, 2, 7, 4, 5 };
		Integer[] nums4 = { 1, 2, 7, 4, 5, 6 };

		if (arraysEqual(nums, nums)) // Arguments of type T and V are implicitly determined when the method is called
			System.out.println("nums is equivalent to nums");

		if (arraysEqual(nums, nums2))
			System.out.println("nums is equivalent to nums2");

		if (arraysEqual(nums, nums3))
			System.out.println("nums is equivalent to nums3");

		if (arraysEqual(nums, nums4))
			System.out.println("nums is equivalent to nums4");

		//
		@SuppressWarnings("unused")
		Double[] dvals = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		// The next line will not be compiled, since the types of the nums and dvals
		// arrays do not match.
		/*
		 * if (arraysEqual(nums, dvals))
		 * System.out.println("nums is equivalent to dvals");
		 */
	}
}