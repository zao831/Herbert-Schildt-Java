package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 186
 * Demonstration of the use of arrays of strings
 */

public class StringArrays {

	public static void main(String[] args) {
		
		String[] strs = { "This", "string", "is", "text." };

		System.out.println("Source array: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		// Edit row (line)
		strs[2] = "is also";
		strs[3] = "text!";

		System.out.println("Changed array: ");
		for (String s : strs)
			System.out.print(s + " ");

	}
}