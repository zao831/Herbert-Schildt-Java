package chapter_11.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 434
 * Questions and exercises 
 * for self-examination
 * Question number 8
 */

public class TickTockHw {

	String state; // Contains information about the state of the clock

	synchronized void tick(boolean running) {
		if (!running) { // Stop the clock
			state = "ticked";
			notify(); // Notify stream that are waiting
			return;
		}

		System.out.print("Tick ");

		// Wait half a second
		try {
			Thread.sleep(500);
		} catch (InterruptedException exc) {
			System.out.println("Interrupted stream " + exc);
		}

		state = "ticked"; // Set the current state after tact "tic"
		notify(); // To allow the tock() method to be executed
		try {
			while (!state.equals("tocked"))
				wait(); // Wait until the tock() method completes
		} catch (InterruptedException exc) {
			System.out.println("Interrupted stream " + exc);
		}
	}

	synchronized void tock(boolean running) {
		if (!running) { // Stop the clock
			state = "tocked";
			notify(); // Notify stream that are waiting
			return;
		}

		System.out.println("Tock");

		// Wait half a second
		try {
			Thread.sleep(500);
		} catch (InterruptedException exc) {
			System.out.println("Interrupted stream " + exc);
		}

		state = "tocked"; // Set the current state after tact "tac"
		notify(); // To allow the tick() method to be executing
		try {
			while (!state.equals("ticked"))
				wait(); // Wait until the tick() method completes
		} catch (InterruptedException exc) {
			System.out.println("Interrupted stream " + exc);
		}
	}
}