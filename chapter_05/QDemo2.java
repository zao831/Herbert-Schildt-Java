package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 177
 */

public class QDemo2 {

	public static void main(String[] args) {
		
		Queue2 bigQ = new Queue2(10);
		Queue2 smallQ = new Queue2(4);
		int ch;
		int i;

		// Fill the bigQ
		for (i = 0; i < 10; i++)
			bigQ.put(i);

		// Extract from bigQ
		System.out.print("Contents bigQ: ");
		for (i = 0; i < 10; i++) {
			
			ch = bigQ.get();
			System.out.print(ch);
			
		}
		System.out.println("\n");

		System.out.println("Using an array smallQ to generate errors:");

		// Using the smallQ queue to generate errors
		for (i = 0; i < 5; i++) {
			
			System.out.print("Attempt to save " + i);
			smallQ.put(i);
			System.out.println();
			
		}
		System.out.println();

		// Additional errors when accessing the queue smallQ
		System.out.print("Содержимое smallQ: ");
		for (i = 0; i < 5; i++) {
			
			ch = smallQ.get();
			System.out.print(ch);
			
		}
		System.out.print(".");
		
	}
}