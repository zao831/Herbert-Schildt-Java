package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 105
 * The body of the cycle can be empty
 */

public class Empty3 {

	public static void main(String[] args) {
		int i;
		
		int sum = 0;
		for(i = 1; i <= 5; sum += i++); // In the cycle, there is no body
		
		System.out.println("sum: " + sum);
		
	}
}
