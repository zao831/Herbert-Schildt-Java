package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 241
 * Overloading methods with a variable number of arguments
*/

public class VarArgs3 {
	
	static void vaTest(int... v) {

		// The first version of the vaTest() method
		System.out.println("vaTest(int...): Number of arguments: " + v.length);
		System.out.println("Content: ");

		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

		System.out.println();
		
	}

	static void vaTest(boolean... v) {
		
		// The second version of the vaTest() method
		System.out.println("vaTest(boolean...): Number of arguments: " + v.length);
		System.out.println("Content: ");

		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

		System.out.println();
		
	}

	static void vaTest(String msg, int... v) {
		
		// The third version of the vaTest() method
		System.out.println("vaTest(String, int ...): Testing: " + v.length);
		System.out.println("Content: ");

		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);

		System.out.println();
		
	}

	public static void main(String[] args) {
		
		VarArgs3.vaTest(1, 2, 3);
		VarArgs3.vaTest("Testing: ", 10, 20);
		VarArgs3.vaTest(true, false, false);

	}
}