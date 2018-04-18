package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 445
 * Exercise 12.1
 * Executing TrafficLightDemo
 */

enum TrafficLightColor {
	RED, GREEN, YELLOW
}

public class TrafficLightSimulator implements Runnable {

	private Thread thrd; // Stream for imitation a traffic light
	private TrafficLightColor tlc; // Current color a traffic light
	boolean stop = false; // Set in true for stopping the imitation of traffic light
	boolean changed = false; // True if the traffic light has switched

	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;

		thrd = new Thread(this);
		thrd.start();
	}

	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;

		thrd = new Thread(this);
		thrd.start();
	}

	// Running an imitation if an automated traffic light
	@Override
	public void run() {
		while (!stop) {
			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000); // green on 10 sec
					break;
				case YELLOW:
					Thread.sleep(2000); // yellow on 2 sec
					break;
				case RED:
					Thread.sleep(12000); // red on 12 sec
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}

	}

	// Switching traffic light color
	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
		}

		changed = true;
		notify(); // Notify of traffic lights switching
	}

	// Waiting for the traffic light to switch
	synchronized void waitForChange() {
		try {
			while (!changed)
				wait(); // Wait of traffic lights switching
			changed = false;
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}

	// Return current color
	TrafficLightColor getColor() {
		return tlc;
	}

	// Stopping the imitation of traffic light
	void cancel() {
		stop = true;
	}
}