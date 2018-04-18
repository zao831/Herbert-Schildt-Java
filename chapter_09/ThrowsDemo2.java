package chapter_09;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 341
 */

public class ThrowsDemo2 {
	
	public static char prompt(String str) throws IOException {

		System.out.print(str + ": ");
		return (char) System.in.read();
	}

	public static void main(String[] args) {
		char ch;

		try {
			ch = prompt("Enter a key");
		} catch (java.io.IOException exc) {
			System.out.println("I/O exception occurred");
			ch = 'X';
		}

		System.out.println("You press key " + ch);
	}
}