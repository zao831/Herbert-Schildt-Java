package chapter_09.QExcDemo;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 349
 * Exercise 9.1
 */

public class QExcDemo {

	public static void main(String[] args) {

		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;

		try {
			// Queue overflow
			for (i = 0; i < 11; i++) {
				System.out.print("Attempt to save: " + (char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			// An attempt to extract a character from an empty string
			for (i = 0; i < 11; i++) {
				System.out.print("Getting the next character: ");
				ch = q.get();
				System.out.println(ch);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}