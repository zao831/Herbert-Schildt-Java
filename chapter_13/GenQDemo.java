package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 490
 * Exercise 13.1
 */

public class GenQDemo {

	public static void main(String[] args) {

		// Create a queue for storing integers
		Integer[] iStore = new Integer[10];
		GenQueue<Integer> q = new GenQueue<Integer>(iStore);

		Integer iVal;

		System.out.println("Demonstration of a queue of numbers of the type Integer");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Adding " + i + " in queue q");
				q.put(i); // Add an integer value to the queue
			}
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.print("Getting the next number of type Integer from the queue q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		// Create a queue for storing floating-point numbers
		Double[] dStore = new Double[10];
		GenQueue<Double> q2 = new GenQueue<Double>(dStore);

		Double dVal;

		System.out.println("Demonstration of a queue of numbers of the type Double");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Adding " + (double) i / 2 + " in queue q2");
				q2.put((double) i / 2); // Enter a value of the type of double in the queue
			}
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.print("Getting the next number of type Double from the queue q2: ");
				dVal = q2.get();
				System.out.println(dVal);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}
}