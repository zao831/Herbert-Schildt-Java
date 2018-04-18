package chapter_15.hw;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 565
 * Questions and exercises 
 * for self-examination
 * Question number 3
 * A simple applet displaying a banner using parameters
 */

/**
 * <applet code = "ParamBanner.class" width = 300 height = 50>
 * <param name = message value = " I like Java! ">
 * <param name = delay value = 500> </applet>
 */

@SuppressWarnings("serial")
public class ParamBanner extends Applet implements Runnable {

	String msg;
	int delay;
	Thread t;
	boolean stopFlag;

	// Initialization variable t, value null
	@Override
	public void init() {
		String temp;
		msg = getParameter("message");
		if (msg == null)
			msg = " Java rules the Web ";
		temp = getParameter("delay");
		try {
			if (temp != null)
				delay = Integer.parseInt(temp);
			else
				delay = 250; // if the parameter is not set, the default value is used
		} catch (NumberFormatException exc) {
			delay = 250; // if error, the default value is used
		}

		t = null;

	}

	// Start thread
	@Override
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	// The entry point to the stream manipulating the large header
	@Override
	public void run() {
		char ch;

		// Re-display banner
		for (;;)
			try {
				repaint();
				Thread.sleep(delay);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if (stopFlag)
					break;
			} catch (InterruptedException exc) {

			}
	}

	// Paused banner
	@Override
	public void stop() {
		stopFlag = true;
		t = null;
	}

	// Display banner
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 50, 30);
	}
}