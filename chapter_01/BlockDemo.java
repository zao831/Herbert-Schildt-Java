package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 50
 * Demonstration of the use of blocks of code
 */

public class BlockDemo {

	public static void main(String[] args) {
		
		double i, j, d;
		
		i = 5;
		j = 10;
		
		// The body of this if operator is a whole block of code
		if(i != 0) {
			System.out.println("i is not zero");
			d = j / i;
			System.out.println("j / i is " + d);
		}
	}
}
