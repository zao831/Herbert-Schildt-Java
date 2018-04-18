package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 364
 */

public class ShowFile4 {

	public static void main(String[] args) {

		int i;
		FileInputStream fin = null;

		// Make sure that the program sends the file name
		if (args.length != 1) {
			System.out.println("Use: ShowFile name_file");
			return;
		}

		// Opening a file, reading characters from it (before EOF), closing the file in
		// a finally
		try {
			fin = new FileInputStream(args[0]);

			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		} finally {
			// The file closes in any case
			try {
				if (fin != null)
					fin.close(); // Close if not null
			} catch (IOException exc) {
				System.out.println("Error close file");
			}
		}
	}
}