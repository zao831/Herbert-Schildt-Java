package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 360
 */

public class ReadBytes {

	public static void main(String[] args) throws IOException {

		byte[] data = new byte[10];
		System.out.print("Enter by symbols: ");
		System.in.read(data);
		System.out.print("You enter: ");
		for (int i = 0; i < data.length; i++)
			System.out.print((char) data[i]);

	}
}