package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 310
 * Exercise 8.1
 * Demonstration of the three 
 * implementations of interface ICharQ
 */

public class IQDemo {

	public static void main(String[] args) {

		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);

		ICharQ iQ;

		char ch;
		int i;

		iQ = q1;

		// Place a series of characters in a fixed-size queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));

		// Display the contents of the queue
		System.out.print("Contents of the fixed queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();

		iQ = q2;

		// Place a series of characters in a dynamic queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('Z' - i));

		// Display the contents of the queue
		System.out.print("Dynamic queue content: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}

		System.out.println();

		iQ = q3;

		// Place a series of characters in the ring queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));

		// Display the contents of the queue
		System.out.print("Contents of the ring queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}

		System.out.println();

		// Put more characters in the ring queue
		for (i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));

		// Display the contents of the queue
		System.out.print("Contents of the ring queue: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}

		System.out.println("\nConservation and use of ring queue data");

		// Put the characters in the ring queue and extract them from there
		for (i = 0; i < 20; i++) {
			iQ.put((char) ('A' + i));
			ch = iQ.get();
			System.out.print(ch);
		}
	}
}