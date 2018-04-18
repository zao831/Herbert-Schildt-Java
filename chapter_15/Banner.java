package chapter_15;

import java.applet.*;
import java.awt.*;

/**
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 546
 * Exercise 15.1
 */

/**
 * <applet code = "Banner" width = 300 height = 50> </applet>
 */

@SuppressWarnings("serial")
public class Banner extends Applet implements Runnable {

	String msg = " Java rules the Web ";
	Thread t;
	boolean stopFlag;

	// Initialize variable t, value null
	@Override
	public void init() {
		t = null;
	}

	// Run thrad
	@Override
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	// The entry point to the stream that animates the banner
	@Override
	public void run() {
		// Redraw banner
		for (;;) {
			try {
				repaint();
				Thread.sleep(250);
				if (stopFlag)
					break;
			} catch (InterruptedException exc) {
				// TODO: handle exception
			}
		}

	}

	// Pause the applet
	@Override
	public void stop() {
		stopFlag = true;
		t = null;
	}

	// Display banner
	@Override
	public void paint(Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}
}