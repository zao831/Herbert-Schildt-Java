package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 86
 * Unexpected result of increasing types!
 */

public class PromDemo {

	public static void main(String[] args) {
		
		byte b;
		int i;

		b = 10;
		i = b * b; // In the following expression, bringing is not required, since the variable "b"
					// is increase raised to int

		b = 10;
		b = (byte) (b * b); // It is required to bring one type to another

		System.out.println("i and b: " + i + " and " + b);

	}
}
