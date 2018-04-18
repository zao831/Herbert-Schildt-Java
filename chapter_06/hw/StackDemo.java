package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 3
 */

public class StackDemo {

	public static void main(String[] args) {
		
		Stack q = new Stack(10);

		// Put characters in the queue q
		for (int i = 0; i < 10; i++)
			q.push((char) ('A' + i));

		// Extract characters from the queue q
		char ch;
		for (int i = 0; i < 10; i++) {
			ch = q.pop();
			System.out.print(ch);
		}
	}
}
