package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 387
 */

public class AvgNums {

	public static void main(String[] args) throws IOException {

		// Create an object of type BufferedReader, using the input stream System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;
		double sum = 0.0;
		double avg, t;

		System.out.print("How many numbers will you enter? - ");
		str = br.readLine();
		try {
			n = Integer.parseInt(str);
		} catch (NumberFormatException exc) {
			System.out.println("Wrong format!");
			n = 0;
		}

		System.out.println("Entering " + n + " values");
		for (int i = 0; i < n; i++) {
			System.out.print(": ");
			str = br.readLine();
			try {
				t = Double.parseDouble(str);
			} catch (NumberFormatException exc) {
				System.out.println("Wrong  format!");
				t = 0.0;
			}
			sum += t;
		}
		avg = sum / n;
		System.out.println("Average value: " + avg);
	}
}