package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 312
 */

public class IQDemo2 {

	public static void main(String[] args) {
		
		DynQueue2 q = new DynQueue2(10);

		char ch;
		int i;

		// Display the initial state of the queue
		System.out.print("Initial state: ");
		ch = q.get();
		System.out.println(ch);

		// Put characters in the queue
		System.out.println("Place the characters in the queue\n");
		for (i = 0; i < 10; i++)
			q.put((char) ('A' + i));

		q.reset();

		// Display the contents of the queue
		System.out.print("\nContents of the ring queue: ");
		// for (i = 0; i < 10; i++) {
		// ch = q.get();
		// System.out.print(ch);
		// }

		ch = q.get();
		System.out.println(ch);

	}
}