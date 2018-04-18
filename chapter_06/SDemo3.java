package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 231
 */

public class SDemo3 {

	public static void main(String[] args) {

		// StaticBlock ob = new StaticBlock("Inside the constructor");
		System.out.println("The square root of 2 is equal to " + StaticBlock.rootOf2);
		System.out.println("The square root of 3 is equal to " + StaticBlock.rootOf3);

	}
}