package chapter_15.hw;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 565
 * Questions and exercises 
 * for self-examination
 * Question number 4
 * A simple applet, displaying current time
 */

/**
 * <object code = "Clock.class" width = 200 height = 50> </object>
 */

@SuppressWarnings("serial")
public class Clock extends Applet implements Runnable {

	String msg;
	Thread t;
	Calendar clock;

	boolean stopFlag;

	// Initialization applet
	@Override
	public void init() {
		t = null;
		msg = "";
	}

	// Start thread
	@Override
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		;
		t.start();
	}

	// The entry point to the thread that displays the time
	@Override
	public void run() {
		// Re-display the time
		for (;;) {
			try {
				repaint();
				Thread.sleep(1000);
				if (stopFlag)
					break;
			} catch (InterruptedException exc) {
				// TODO: handle exception
			}
		}
	}

	// Pause the thread that displays the time
	@Override
	public void stop() {
		stopFlag = true;
		t = null;
	}

	// Display the time
	@Override
	public void paint(Graphics g) {
		clock = Calendar.getInstance();
		msg = "Current time: " + Integer.toString(clock.get(Calendar.HOUR));
		msg = msg + ":" + Integer.toString(clock.get(Calendar.MINUTE));
		msg = msg + ":" + Integer.toString(clock.get(Calendar.SECOND));
		g.drawString(msg, 30, 30);
	}
}