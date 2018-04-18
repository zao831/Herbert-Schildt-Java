package chapter_16.hw;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 592
 * Demonstration of the use of simple list JList
 */

public class ListDemoHw implements ListSelectionListener {

	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;

	// Create names array
	String[] names = { "Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy", "Tom", "Mary", "Ken", "Andrew", "Matt",
			"Todd" };

	public ListDemoHw() {
		// Create new container JFrame
		JFrame jfrm = new JFrame("JList Demo");

		// Set the FlowLayout object for the layout manager
		jfrm.setLayout(new FlowLayout());

		// Set initial size frame
		jfrm.setSize(200, 160);

		// Shut down program when the user closes application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create JList object
		jlst = new JList<String>(names);

		// Add a list to the panel with scroll bars
		jscrlp = new JScrollPane(jlst);

		// Set the preferred size of the scalable panel
		jscrlp.setPreferredSize(new Dimension(120, 90));

		// Create a label to display selection results
		jlab = new JLabel("Please choose a name");

		// Add an event handler for selecting an item from the list
		jlst.addListSelectionListener(this);

		// Add list and label in the content pane
		jfrm.add(jscrlp);
		jfrm.add(jlab);

		// Display frame
		jfrm.setVisible(true);

	}

	// handle to events that occur when selecting items from the list
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// Get the index of the item whose selection status was changed
		int idx = jlst.getSelectedIndex();

		// Display the selection result if the item was selected
		if (idx != -1)
			jlab.setText("Current selection: " + names[idx]);
		else // Otherwise, once again offer to make a choice
			jlab.setText("Please choose name");

	}

	public static void main(String[] args) {
		// Create frame in the dispatching flows
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ListDemoHw();
			}
		});
	}
}