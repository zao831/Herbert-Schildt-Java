package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 102
 * The "for" cycle, executed with a negative increment of the variable
 */

public class DecrFor {

	public static void main(String[] args) {
		
		for (int x = 100; x > -100; x -= 5) {
			
			System.out.println(x);
			
		}
	}
}
