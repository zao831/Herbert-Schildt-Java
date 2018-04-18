package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 467
 * Demonstration of the use of the generalized class
 */

public class GenDemo {

	public static void main(String[] args) {

		// Create reference on Gen_<Integer> type object
		Gen<Integer> iOb;

		/*
		 * Create an object of type Gen_<Integer> and assign a reference to it to the
		 * variable iOb. Note the auto-packing when encapsulating a value of 88 in an
		 * object of type Integer.
		 */
		iOb = new Gen<Integer>(88);

		// Display the type of value used in the strOb object
		iOb.showType();

		// Get values from the iOb object. Note that casting is not required here.
		int v = iOb.getob();
		System.out.println("Value iOb: " + v);

		System.out.println();

		// Create an object of type Gen_ for strings
		Gen<String> strOb = new Gen<String>("Testing generalizations");

		// Display the type of value used in the strOb object
		strOb.showType();

		// Get of the value from the strOb object. Note that casting is not required
		// here.
		String str = strOb.getob();
		System.out.println("Value strOb: " + str);
	}
}