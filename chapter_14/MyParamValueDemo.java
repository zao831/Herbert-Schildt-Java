package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 508
 */

public class MyParamValueDemo {

	public static void main(String[] args) {

		MyParamValue myPval = n -> 1.0 / n;
		System.out.println("The value inverse of 4 is equal to " + myPval.getValue(4.0));
	}
}