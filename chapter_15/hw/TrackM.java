package chapter_15.hw;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 565
 * Questions and exercises 
 * for self-examination
 * Question number 7
 * Track the movement of the mouse by drawing a line. 
 * The signs of the beginning and the end of the line are pressing and releasing the mouse button.
 */

/**
 * <applet code = "TrackM.class" width = 300 height = 100> </applet>
 */

@SuppressWarnings("serial")
public class TrackM extends Applet implements MouseListener, MouseMotionListener {

	int curX = 0, curY = 0; // Current coordinates
	int oldX = 0, oldY = 0; // Previous coordinates
	boolean draw;

	@Override
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
		draw = false;
	}

	/*
	 * The following three methods are not used, but their empty implementations are
	 * needed, since these methods are declared in the MouseListener interface
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */

	// Process the mouse pointer over the user interface element
	@Override
	public void mouseEntered(MouseEvent e) {

	}

	// Edit the mouse pointer to the user interface element
	@Override
	public void mouseExited(MouseEvent e) {

	}

	// Process mouse click
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	// Process mouse click
	@Override
	public void mousePressed(MouseEvent e) {
		// Keep coordinates
		oldX = e.getX();
		oldY = e.getY();
		draw = true;
	}

	// Process releasing the mouse button
	@Override
	public void mouseReleased(MouseEvent e) {
		draw = false;
	}

	// Edit mouse dragging
	@Override
	public void mouseDragged(MouseEvent e) {
		// Keep coordinates
		curX = e.getX();
		curY = e.getY();
		repaint();
	}

	// Edit mouse movement
	@Override
	public void mouseMoved(MouseEvent e) {
		// Reflect state
		showStatus("Mouse movement: " + e.getX() + ", " + e.getY());
	}

	@Override
	public void paint(Graphics g) {
		if (draw)
			g.drawLine(oldX, oldY, curX, curY);
	}
}