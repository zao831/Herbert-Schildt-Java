package chapter_10.hw;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 394
 * Questions and exercises 
 * for self-examination
 * Question number 7
 */

public class Hyphen {

	public static void main(String[] args) {
		
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		// Check if the names of both files are specified
		if (args.length != 2) {
			System.out.println("Use: Hyphen where from");
			return;
		}

		// Copy the file and replace the spaces with hyphen
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				// replace the spaces with hyphen
				if ((char) i == ' ')
					i = '-';

				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing input file");
			}

			try {
				if (fin != null)
					fout.close();
			} catch (IOException exc) {
				System.out.println("Error closing output file");
			}
		}
	}
}