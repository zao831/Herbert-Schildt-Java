package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 432
 * Exercise 11.2
 */

public class UseMain {
	
	public static void main(String[] args) {
		
		Thread thrd;

		// Get current stream
		thrd = Thread.currentThread();

		// Display the name of the main stream
		System.out.println("Name main stream: " + thrd.getName());

		// Display the priority of the main stream
		System.out.println("Priority main stream: " + thrd.getPriority());

		System.out.println();

		// Set the name and priority of the main stream
		System.out.println("Set the name and priority\n");
		thrd.setName("Thread #1");
		thrd.setPriority(Thread.NORM_PRIORITY + 3);

		System.out.println("New main stream name: " + thrd.getName());

		System.out.println("New priority value: " + thrd.getPriority());

	}
}