package chapter_16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 581
 * Demonstration of button creation and event handling
 */

public class ButtonDemo implements ActionListener {

	JLabel jlab;

	public ButtonDemo() {
		// Create new container JFrame
		JFrame jfrm = new JFrame("A button Example");

		// Set the FlowLayout object for the layout manager
		jfrm.setLayout(new FlowLayout());

		// Set initial sizes frame
		jfrm.setSize(230, 100);

		// Shut down the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create two buttons
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");

		// Add action listeners
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);

		// Add button in the content pane
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);

		// Create label
		jlab = new JLabel("Press a button.");

		// Add the label to frame
		jfrm.add(jlab);

		// Display frame
		jfrm.setVisible(true);
	}

	// Process a button events
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else
			jlab.setText("You pressed Down.");

	}

	public static void main(String[] args) {
		// Create a frame in the event dispatching flows
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ButtonDemo();
			}
		});
	}
}