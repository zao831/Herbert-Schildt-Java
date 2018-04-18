package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 176
 * Exercise 5.2 (page 173)
 */

public class QDemo {

	public static void main(String[] args) {

		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Using the queue bigQ to save the alphabet");

		// Put alphabetic characters in the queue bigQ
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		// Extract alpha characters from the bigQ queue and display them
		System.out.print("Contents of the queue bigQ: ");

		for (i = 0; i < 26; i++) {

			ch = bigQ.get();
			if (ch != (char) 0)
				System.out.print(ch);

		}

		System.out.println("\n");

		System.out.println("Using the smallQ queue to generate errors");

		// Use smallQ queue to generate errors
		for (i = 0; i < 5; i++) {

			System.out.print("Attempt to save " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();

		}
		// System.out.println();

		// Additional errors when accessing the queue smallQ
		System.out.print("Content smallQ: ");
		for (i = 0; i < 5; i++) {

			ch = smallQ.get();
			if (ch != (char) 0)
				System.out.print(ch);

		}
	}
}