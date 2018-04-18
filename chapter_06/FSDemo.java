package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 207
 */

public class FSDemo {

	public static void main(String args[]) {

		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		// System.out.println(fs.length);// 5
		System.out.println("Error handling without report output");

		for (int i = 0; i < (fs.length * 2); i++)
			fs.put(i, i * 10);
		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1)
				System.out.print(x + " ");
		}

		// System.out.println("");

		System.out.println("\nError handling with report output");

		for (int i = 0; i < (fs.length * 2); i++)
			if (!fs.put(i, i * 10))
				System.out.println("Index " + i + " out of range");

		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1)
				System.out.print(x + " ");
			else
				System.out.print("\nIndex " + i + " out of range");

		}
	}
}