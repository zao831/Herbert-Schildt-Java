package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 375
 */

public class RandomAccessDemo {

	public static void main(String[] args) {

		double[] data = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;

		// Open and use a random access file
		try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
			// Write value to file
			for (int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}

			// Read individual values from file
			raf.seek(0); // Find the fist value of type double
			d = raf.readDouble();
			System.out.println("Fist value: " + d);

			raf.seek(8); // Find the second value of type double
			d = raf.readDouble();
			System.out.println("Second value: " + d);

			raf.seek(8 * 3); // Find the fourth value of type double
			d = raf.readDouble();
			System.out.println("Fourth value: " + d);

			System.out.println();

			// Read values through one
			System.out.print("Reading odd-numbered values: ");
			for (int i = 0; i < data.length; i += 2) {
				raf.seek(8 * i); // Find i-e value of type double
				d = raf.readDouble();
				System.out.print(d + " ");
			}

		} catch (IOException exc) {
			System.out.println("I/O error: " + exc);
		}
	}
}