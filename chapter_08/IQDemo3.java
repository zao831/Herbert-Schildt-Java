package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 320
 * Questions and exercises 
 * for self-examination
 * Question number 1
 */

import chapter_08.hwqpack.*;

public class IQDemo3 {

	public static void main(String[] args) {

		FixedQueue2 q1 = new FixedQueue2(10);
		DynQueue3 q2 = new DynQueue3(5);
		CircularQueue2 q3 = new CircularQueue2(10);

		ICharQ3 iQ;

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