package chapter_15;

import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

/**
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 551
 */

/**
 * <applet code = "MouseEvent.class" width = 1000 height = 800> </applet>
 */

@SuppressWarnings("serial")
public class MouseEvent extends Applet implements MouseListener, MouseMotionListener {
	
	String msg = "";
	int mouseX = 0, mouseY = 0; // Coordinates of the mouse pointer

	@Override
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	// Click event handler.
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}

	// The handler for the pointer to the region of the element.
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}

	// Handler for the exit event of the pointer out of the element's area
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}

	// Mouse click event handler
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// Keep coordinates
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Down";
		repaint();
	}

	// Mouse Button Event Handler
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// Keep the coordinates of the current cursor position
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Up";
		repaint();
	}

	// The mouse pointer event handler
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// Keep coordinates
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*";
		showStatus("Draging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	// // Handler for the mouse pointer event
	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// Display the status
		showStatus("Moving mouse at " + e.getX() + ", " + e.getY());
	}

	// Display the message in the applet window
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}