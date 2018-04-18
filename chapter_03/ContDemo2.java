package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Personal exercise with tags
 */

public class ContDemo2 {

	public static void main(String[] args) {
		
		int i;
		
		// Output even numbers between 0 and 100
		for(i = 0; i <= 100; i++) one: {
			
			// Complete the iteration step of the cycle
			if((i % 2) != 0) break one;
			
			System.out.print(i + " ");
			
		}
	}
}
