package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 107
 * Demonstration of the use of the cycle while
 */

public class WhileDemo {

	public static void main(String[] args) {
		
		char ch;
		int count = 0;

		// Output the letters of the English alphabet using the cycle "while"
		ch = 'a';
		while (ch <= 'z') {
			System.out.print(ch + " ");
			ch++;
			count++;
		}
		System.out.println("\n\nIn the English alphabet " + count + " letters");
		
	}
}
