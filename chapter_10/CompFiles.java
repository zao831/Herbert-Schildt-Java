package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 373
 * Exercise 10.1
 */

public class CompFiles {

	public static void main(String[] args) {
		int i = 0, j = 0;

		// Make sure that both files are transferred to the program
		if (args.length != 2) {
			System.out.println("Use: CompFiles file1 file2");
			return;
		}

		// Compare Files
		try (FileInputStream f1 = new FileInputStream(args[0]); FileInputStream f2 = new FileInputStream(args[1])) {
			// Check the contents of each file
			do {
				i = f1.read();
				j = f2.read();
				if (i != j)
					break;
			} while (i != -1 && j != -1);
			if (i != j)
				System.out.println("The contents of the files are different");
			else
				System.out.println("The contents of the files are the same");
		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		}
	}
}