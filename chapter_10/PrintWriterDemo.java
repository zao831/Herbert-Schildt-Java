package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 382
 */

public class PrintWriterDemo {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.65;

		pw.println("Use class PrintWriter");
		pw.println(i);
		pw.println(d);

		pw.println(i + " + " + d + " = " + (i + d));

	}
}