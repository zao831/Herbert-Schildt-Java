package chapter_15;

import java.awt.*;
import java.applet.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 539
 */

/*
 * <applet code = "SimpleApplet" width = 200 height = 60>
 * </applet>
 */

@SuppressWarnings("serial")
public class SimpleApplet extends Applet {
	@Override
	public void paint(Graphics g) {
		g.drawString("Java makes applets easy.", 20, 20);
	}
}