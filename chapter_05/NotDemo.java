package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 195
 * Demonstration of bitwise operation NOT
 */

public class NotDemo {

	public static void main(String[] args) {
		
		byte b = -34;

		for (int t = 128; t > 0; t = t / 2) {
			
			if ((b & t) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			
		}
		
		System.out.println();

		// Invert the state of all bits
		b = (byte) ~b;

		for (int t = 128; t > 0; t = t / 2) {
			
			if ((b & t) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			
		}
	}
}