package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 391
 * Exercise 10.2
 */

public class Help {
	
	String helpfile; // Name of the file containing the help information

	public Help(String fname) {
		helpfile = fname;
	}

	// Display help information on the topic
	boolean helpon(String what) {
		
		int ch;
		String topic, info;

		// Open help file
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
			do {
				// Read the symbols until the symbol #
				ch = helpRdr.read();

				// Check if the topics match
				if (ch == '#') {
					topic = helpRdr.readLine();
					if (what.compareTo(topic) == 0) { // Find topic
						do {
							info = helpRdr.readLine();
							if (info != null)
								System.out.println(info);
						} while ((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			} while (ch != -1);
		} catch (IOException exc) {
			System.out.println("Error when trying to access the help file");
			return false;
		}
		return false; // Topic is not find
	}

	// Get help file theme
	String getSelection() {
		String topic = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a topic: ");
		try {
			topic = br.readLine();
		} catch (IOException exc) {
			System.out.println("Error reading from the console");
		}
		return topic;
	}
}