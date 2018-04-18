package chapter_16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 601
 * Simple Swing applet
 */

/**
 * <object code = "MySwingApplet.class" width = 200 height = 80> </object>
 */

@SuppressWarnings("serial")
public class MySwingApplet extends JApplet {

	JButton jbtnUp;
	JButton jbtnDown;

	JLabel jlab;

	// Initialize the applet
	@Override
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {

				@Override
				public void run() {
					makeGUI(); // Initialize the graphical interface
				}
			});
		} catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}

	// In this applet, there is no need to override methods start(), stop() and
	// destroy();

	// Set and initialize the graphical interface
	private void makeGUI() {
		// Set layout manager FlowLayout for applet
		setLayout(new FlowLayout());

		// Create two button
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");

		// Add events listener for button Up
		jbtnUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("You press Up");
			}
		});

		// Add events listener for button Down
		jbtnDown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlab.setText("You press Down");

			}
		});

		add(jbtnUp);
		add(jbtnDown);

		// Create text label
		jlab = new JLabel("Press a button.");

		// Add label in the content pane
		add(jlab);
	}
}