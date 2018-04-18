package chapter_16;

import javax.swing.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 575
 * Simple Swing-program
 */

public class SwingDemo {

	public SwingDemo() {
		// Create new container JFrame
		JFrame jfrm = new JFrame("A simple Swing Application");

		// Set initial sizes JFrame
		jfrm.setSize(275, 100);

		// Shut down the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a text label
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");

		// Add a label to the content pane
		jfrm.add(jlab);

		// Display frame
		jfrm.setVisible(true);
	}

	public static void main(String[] args) {
		// Create a frame in the event dispatching flows
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingDemo();
			}
		});
	}
}