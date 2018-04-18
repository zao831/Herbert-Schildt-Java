package chapter_15;

import java.awt.*;
import java.applet.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 550
 */

/*
 * <applet code = "StatusWindow" width = 300 height = 50>
 * </applet>
 */

@SuppressWarnings("serial")
public class StatusWindow extends Applet {
	
	// Display the contents of the msg variable in the applet window
	@Override
	public void paint(Graphics g) {
		g.drawString("This is in the applet window.", 10, 20);
		showStatus("This is shown in the status window");
	}
}