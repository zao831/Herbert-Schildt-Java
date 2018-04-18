package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 369
 */

public class CopyFile2 {

	public static void main(String[] args) throws IOException {

		int i;
		// FileInputStream fin = null;
		// FileOutputStream fout = null;

		// Make sure that the program passes the names of both files
		if (args.length != 2) {
			System.out.println("Use: CopyFile from where to");
			return;
		}

		// Copy file
		try (FileInputStream fin = new FileInputStream(args[0]);
				FileOutputStream fout = new FileOutputStream(args[1]);) {

			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O error" + exc);
		}
	}
}