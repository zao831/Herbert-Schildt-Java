package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 383
 */

public class DtoS {

	public static void main(String[] args) {

		String s;
		// Create and use a BufferedReader object, placed in a shell based on the
		// FileReader class
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) { // Creating a FileReader object
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		}
	}
}