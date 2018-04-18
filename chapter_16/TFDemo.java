package chapter_16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 585
 * Using the text field
 */

public class TFDemo implements ActionListener {

	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;

	public TFDemo() {
		// Create new container JFrame
		JFrame jfrm = new JFrame("Use a Text Field");

		// Set the FlowLayout object for the layout manager
		jfrm.setLayout(new FlowLayout());

		// Set initial sizes frame
		jfrm.setSize(240, 120);

		// Shut down the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create text field
		jtf = new JTextField(10);

		// Set action command for text field
		jtf.setActionCommand("myTF");

		// Create button Reverse
		JButton jbtnRev = new JButton("Reverse");

		// Add action listeners for the text field and button
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);

		// Create label
		jlabPrompt = new JLabel("Enter text: ");
		jlabContents = new JLabel("");

		// Add components in the content pane
		jfrm.add(jlabPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtnRev);
		jfrm.add(jlabContents);

		// Display frame
		jfrm.setVisible(true);

	}

	// Process a actions events
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Reverse")) {
			// The Reverse button was pressed
			String orgStr = jtf.getText();
			String resStr = "";

			// Invert string in text field
			for (int i = orgStr.length() - 1; i >= 0; i--)
				resStr += orgStr.charAt(i);
			// Save inverted string in text field
			jtf.setText(resStr);
		} else // The Enter key was pressed while the input focus was in the text box
			jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
	}

	public static void main(String[] args) {
		// Create a frame in the event dispatching flows
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TFDemo();
			}
		});
	}
}