package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 423
 * Executing ThreadCorn
 */

public class TickTock {
	
	String state; // Contains information about the state of the clock

	synchronized void tick(boolean running) {
		if (!running) { // Stop the clock
			state = "ticked";
			notify(); // Notify streams that are waiting
			return;
		}

		System.out.print("Tick ");

		state = "ticked"; // Set the current state after tact "tic"
		notify(); // to allow the tock() method to be executed
		try {
			while (!state.equals("tocked"))
				wait(); // wait until the tock() method completes
		} catch (InterruptedException exc) {
			System.out.println("Interrupted thread");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) { // Stop the clock
			state = "tocked";
			notify(); // Notify streams that are waiting
			return;
		}

		System.out.println("Tock");

		state = "tocked"; // Set the current state after tact "tac"
		notify(); // to allow the tick() method to be executed
		try {
			while (!state.equals("ticked"))
				wait(); // wait until the tick() method completes
		} catch (InterruptedException exc) {
			System.out.println("Interrupted thread");
		}
	}
}