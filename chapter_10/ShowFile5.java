package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 368
 */

public class ShowFile5 {

	public static void main(String[] args) {

		int i;
		// FileInputStream fin = null;

		// Make sure that the program sends the file name
		if (args.length != 1) {
			System.out.println("Use: ShowFile name_file");
			return;
		}

		// Use try with resources to open a file and then close it after the try block
		// is left
		try (FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		}
	}
}