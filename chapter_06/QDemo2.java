package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 225
 * Exercise 6.2 (page 223)
 */

public class QDemo2 {

	public static void main(String[] args) {

		// Create empty queue for 10 items
		Queue q1 = new Queue(10);

		char[] name = { 'T', 'o', 'm' };
		// Create an array-based queue
		Queue q2 = new Queue(name);

		char ch;
		int i;

		// Put a range of symbol in the queue "q1"
		for (i = 0; i < 10; i++)
			q1.put((char) ('A' + i));

		// Create one queue based on another
		Queue q3 = new Queue(q1);

		// Show queues
		System.out.print("Content q1: ");
		for (i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Content q2: ");
		for (i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Content q3: ");
		for (i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
}