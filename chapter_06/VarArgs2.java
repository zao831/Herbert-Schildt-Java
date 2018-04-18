package chapter_06;

/*
 * Herbert Schildt 
 * Java: A Beginners Guide 
 * Page 240
 * Using an array of arguments of variable length along with the usual arguments
 */

public class VarArgs2 {

	// msg - normal parameter, and v - variable length array
	static void vaTest(String msg, int... v) {
		System.out.println(msg + v.length);
		System.out.println("Content: ");

		for (int i = 0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);

		System.out.println();

	}

	public static void main(String args[]) {
		
		vaTest("One argument in an array: ", 10);
		vaTest("Three arguments in an array: ", 1, 2, 3);
		vaTest("No array arguments: ");

	}
}