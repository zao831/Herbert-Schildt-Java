package chapter_10.hw;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 394
 * Questions and exercises 
 * for self-examination
 * Question number 8
 */

public class Hyphen2 {

	public static void main(String[] args) throws IOException {
		int i;

		// Check if the names of both files are specified
		if (args.length != 2) {
			System.out.println("Use: Hyphen2 where from");
			return;
		}

		// Copy the file and replace the spaces with hyphen
		try (FileReader fin = new FileReader(args[0]); FileWriter fout = new FileWriter(args[1])) {
			do {
				i = fin.read();
				// Replace the spaced with hyphen
				if ((char) i == ' ')
					i = '-';

				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O error:" + exc);
		}
	}
}