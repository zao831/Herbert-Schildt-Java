package chapter_12.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 463
 * Questions and exercises 
 * for self-examination
 * Question number 4
 */

enum TrafficLightColor {
	RED(12000), GREEN(10000), YELLOW(2000);

	private int delay;

	private TrafficLightColor(int d) {
		delay = d;
	}

	int getDelya() {
		return delay;
	}
}

public class TrafficLightSimulator implements Runnable {

	private Thread thrd;
	private TrafficLightColor tlc;
	boolean stop = false;
	boolean changed = false;

	public TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;

		thrd = new Thread(this);
		thrd.start();
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(tlc.getDelya());
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}

			changeColor();
		}
	}

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
		notify();
	}

	synchronized void waitForChange() {
		try {
			while (!changed)
				wait();
			changed = false;
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}

	TrafficLightColor getColor() {
		return tlc;
	}

	void cancel() {
		stop = true;
	}
}