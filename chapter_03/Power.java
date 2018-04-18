package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 108
 * calculation of integer degree of number 2
 */

public class Power {

	public static void main(String[] args) {
		
		int e, result;

		for (int i = 0; i <= 10; i++) {
			
			result = 1;
			e = i;
			
			while (e > 0) {
				
				result *= 2;
				e--;
				
			}

			System.out.println("2 in the degree " + i + " is " + result);
			
		}
	}
}
