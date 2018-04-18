package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 414
 */

public class Priority implements Runnable {
	
	int count;
	Thread thrd;

	static boolean stop = false;
	static String currentName;

	// Create a new thread. Attention! The constructor does not start the thread to
	// execute!
	public Priority(String name) {
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}

	// Start a new thread
	@Override
	public void run() {
		System.out.println(thrd.getName() + " - start");
		do {
			count++;

			if (currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("B " + currentName);
			}
		} while (stop == false && count < 10_000_000);
		stop = true;

		System.out.println("\n" + thrd.getName() + " - completion");
	}
}