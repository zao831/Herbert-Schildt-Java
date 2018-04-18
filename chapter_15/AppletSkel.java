package chapter_15;

import java.awt.*;
import java.applet.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 543
 */

/*
 * <applet code = "AppletSkel" width = 300 height = 100>
 * </applet>
 */

@SuppressWarnings("serial")
public class AppletSkel extends Applet {
	
	// This method call first
	@Override
	public void init() {
		// Initialization
	}

	/*
	 * This method is called second after the init () method. It is also called
	 * whenever the applet is restarted.
	 */
	@Override
	public void start() {
		// Run or resume execution
	}
	
	// this method called to suspend the applet
	@Override
	public void stop() {
		// pause execution
	}
	
	// Call this method the last to kill the applet
	@Override
	public void destroy() {
		// execution of final actions
	}
	
	// This method is called to update the data in the applet window
	@Override
	public void paint(Graphics g) {
		// Redrawing the contents of the window
	}
}