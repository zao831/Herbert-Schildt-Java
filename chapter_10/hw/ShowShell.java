package chapter_10.hw;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 394
 * Questions and exercises 
 * for self-examination
 * Question number 6
 */

public class ShowShell {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		double t = 0.0;

		System.out.print("Enter a number in the string format: ");
		str = br.readLine();
		try {
			t = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.out.println("I/O error: " + e);

		}
		System.out.println("\nYou entered the number " + t + " in the binary format");

	}
}