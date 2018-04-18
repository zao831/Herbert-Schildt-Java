package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 383
 */

public class KtoD {

	public static void main(String[] args) {

		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try (FileWriter fw = new FileWriter("test.txt")) {
			do {
				System.out.print(": ");
				str = br.readLine();

				if (str.compareTo("stop") == 0)
					break;

				str = str + "\r\n"; // Add newlines symbol
				fw.write(str);
			} while (str.compareTo("stop") != 0);
		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		}
	}
}