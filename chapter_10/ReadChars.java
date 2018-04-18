package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 380
 */

public class ReadChars {

	public static void main(String[] args) throws IOException {

		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the symbols; end of input - symbol of the point");
		// Read symbols
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != '.');

	}
}