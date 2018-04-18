package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 381
 */

public class ReadLines {

	public static void main(String[] args) throws IOException {

		// Create a BufferedReader object associated with the System.in stream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		System.out.println("Enter text strings");
		System.out.println("The end of the input character is the 'stop' line");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}
}