package chapter_16.hw;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 640
 * Questions and exercises 
 * for self-examination
 * Question number 17
 * A file comparison utility based on Swing. In this version, a check box is provided, setting which specifies the position of the first discrepancy in the contents of the compared files. To compile this utility, you need the JDK 7 or later version of this kit.
 * Implementation of Exercise 16.1 with check box.
 */

public class SwingFCHw implements ActionListener {

	JTextField jtfFirst; // Stores the name of the first file
	JTextField jtfSecond; // Stores the name of the second file

	JButton jbtnComp; // file compare start operation button

	JLabel jlabFirst, jlabSecond; // labels, that display prompts for the user
	JLabel jlabResult; // label, that display comparison result and error messages

	JCheckBox jcbLoc; // Set to display the position of the first a files mismatch

	public SwingFCHw() {
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

		// Create the "Compare" button
		JButton jbtnComp = new JButton("Compare");

		// Add an event listener for the Compare button
		jbtnComp.addActionListener(this);

		// Create label
		jlabFirst = new JLabel("First file ");
		jlabSecond = new JLabel("Second file ");
		jlabResult = new JLabel("");

		// Create Check box
		jcbLoc = new JCheckBox("Show position of mismatch");

		// Add components in the content pane
		jfrm.add(jlabFirst);
		jfrm.add(jtfFirst);
		jfrm.add(jlabSecond);
		jfrm.add(jtfSecond);
		jfrm.add(jcbLoc);
		jfrm.add(jbtnComp);
		jfrm.add(jlabResult);

		// Display frame
		jfrm.setVisible(true);

	}

	// Compare files after the press button Compare
	@Override
	public void actionPerformed(ActionEvent ae) {
		int i = 0, j = 0;
		int count = 0;

		// First make sure that the names of both files are entered
		if (jtfFirst.getText().equals("")) {
			jlabResult.setText("First file mane missing.");
			return;
		}
		if (jtfSecond.getText().equals("")) {
			jlabResult.setText("Second file name missing.");
			return;
		}

		// Compare files, using a try operator with resources
		try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
				FileInputStream f2 = new FileInputStream(jtfSecond.getText());) {
			// Compare the content of the files
			do {
				i = f1.read();
				j = f2.read();
				if (i != j)
					break;
				count++;
			} while (i != -1 && j != -1);

			if (i != j) {
				if (jcbLoc.isSelected())
					jlabResult.setText("Files differ at location " + count);
				else
					jlabResult.setText("Files are the same.");
			} else
				jlabResult.setText("Files compare equal.");

		} catch (IOException exc) {
			jlabResult.setText("File error");
		}

	}

	public static void main(String[] args) {
		// Create frame in the dispatching flow
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SwingFCHw();
			}
		});
	}
}