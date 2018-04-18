package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 492
 * Demonstrate the use of the base type
 */

public class RawGen {

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {

		// Create a Gen object for the Integer type
		Gen<Integer> iOb = new Gen<Integer>(88);

		// Create a Gen object for the String type
		Gen<String> strOb = new Gen<String>("Testing generalizations");

		// Create a base object of the Gen class and pass it a value of type Double
		@SuppressWarnings("rawtypes")
		Gen raw = new Gen(new Double(98.6));

		// Here type conversion is required, because the type is unknown
		double d = (Double) raw.getob();
		System.out.println("Value: " + d);

		/*
		 * Using a base type can lead to runtime exceptions. The corresponding examples
		 * are presented below.
		 */

		// The casting of types cause a runtime error!
		// int i = (Integer) raw.getob(); // Error

		// This assignment violates the security of types
		strOb = raw; // Possible, but potentially incorrect

		// String str = strOb.getob(); // Run-time error

		// Next assignment violates also the security of types
		raw = iOb; // Possible, but potentially incorrect
		// d = (Double) raw.getob(); // Run-time error

	}
}