package chapter_10;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 371
 */

public class RWData {

	public static void main(String[] args) {

		int i = 10;
		double d = 1023.56;
		boolean b = true;

		// Write a series of values
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
			System.out.println("Recorded: " + i);
			dataOut.writeInt(i);

			System.out.println("Recorded: " + d);
			dataOut.writeDouble(d);

			System.out.println("Recorded: " + b);
			dataOut.writeBoolean(b);

			System.out.println("Recorded: " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);

		} catch (IOException exc) {
			System.out.println("Error while writing");
			return;
		}

		System.out.println();

		// Read the recorded
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
			i = dataIn.readInt();
			System.out.println("Read: " + i);

			d = dataIn.readDouble();
			System.out.println("Read: " + d);

			b = dataIn.readBoolean();
			System.out.println("Read: " + b);

			d = dataIn.readDouble();
			System.out.println("Read: " + d);

		} catch (IOException exc) {
			System.out.println("Error reading");

		}
	}
}