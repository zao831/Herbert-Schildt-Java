package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 362
 */

public class ShowFile {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		int i;
		FileInputStream fin = null;

		// Make sure that the program sends the file name
		if (args.length != 1) {
			System.out.println("Use: ShowFile name_file");
			return;
		}

		try {
			// Read the bytes until the EOF character encounters
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Error reading file");
		}

		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("Error close file");
		}
	}
}