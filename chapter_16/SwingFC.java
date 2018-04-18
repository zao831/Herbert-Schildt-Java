package chapter_16;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
 * Herbert Schildt 
 * Java: A Beginners Guide 
 * Page 597 
 * Exercise 16.1
 */

public class SwingFC implements ActionListener {

	JTextField jtfFirst; // Stores the name of the first file
	JTextField jtfSecond; // Stores the name of the second file

	JButton jbtnComp; // file compare start operation button

	JLabel jlabFirst, jlabSecond; // labels, that display tips for the user

	JLabel jlabResult; // labels to display comparison result and error messages

	public SwingFC() {
		// Create new container JFrame
		JFrame jfrm = new JFrame("Compare files");

		// Set the FlowLayout object for the layout manager
		jfrm.setLayout(new FlowLayout());

		// Set initial size frame
		jfrm.setSize(200, 190);

		// Shut down program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create fields for entering files names
		jtfFirst = new JTextField(14);
		jtfSecond = new JTextField(14);

		// Set action command for text fields
		jtfFirst.setActionCommand("fileA");
		jtfSecond.setActionCommand("fileB");

		// Create "Compare" button
		JButton jbtnComp = new JButton("Compare");

		// Add an event listener for the Compare button
		jbtnComp.addActionListener(this);

		// Create label
		jlabFirst = new JLabel("First file: ");
		jlabSecond = new JLabel("Second file: ");
		jlabResult = new JLabel("");

		// Add components in the content pane
		jfrm.add(jlabFirst);
		jfrm.add(jtfFirst);
		jfrm.add(jlabSecond);
		jfrm.add(jtfSecond);
		jfrm.add(jbtnComp);
		jfrm.add(jlabResult);

		// Display frame
		jfrm.setVisible(true);

	}

	// Compare files after the press button Compare
	@Override
	public void actionPerformed(ActionEvent e) {
		int i = 0, j = 0;

		// First make sure that the names of both files are entered
		if (jtfFirst.getText().equals("")) {
			jlabResult.setText("First file name missing.");
			return;
		}
		if (jtfSecond.getText().equals("")) {
			jlabResult.setText("Second file name missing.");
			return;
		}

		// Compare files, using a try operator with resources
		try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
				FileInputStream f2 = new FileInputStream(jtfSecond.getText());) {
			// Compare the contents of both files
			do {
				i = f1.read();
				j = f2.read();
				if (i != j)
					break;
			} while (i != -1 && j != -1);

			if (i != j)
				jlabResult.setText("Files are not the same.");
			else
				jlabResult.setText("Files compare equal.");
		} catch (IOException exc) {
			jlabResult.setText("File Error");
		}

	}

	public static void main(String[] args) {
		// Create frame in the dispatching flows
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SwingFC();
			}
		});
	}
}