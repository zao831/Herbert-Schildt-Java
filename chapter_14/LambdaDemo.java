package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 509
 */

public class LambdaDemo {

	public static void main(String[] args) {

		MyValue myVal; // the link to the interface

		/*
		 * Here the lambda expression is just a constant. When it is assigned the
		 * variable myVal creates an instance of the class in which the lambda
		 * expression implements the getValue() method of the MyValue interface.
		 */
		myVal = () -> 98.6; // A simple lambda expression

		/*
		 * Call the getValue() method provided by the previously assigned lambda
		 * expression.
		 */
		System.out.println("Permanent value: " + myVal.getValue());

		/*
		 * Create a parameterized lambda expression and assign it to a reference to the
		 * MyParamValue instance. This lambda expression returns the inverse value of
		 * its argument.
		 */
		MyParamValue myPval = (n) -> 1.0 / n; // A lambda expression that has a parameter

		// Call the getValue (v) method with the myPval reference.
		System.out.println("The value inverse of 4 is equal to " + myPval.getValue(4.0));
		System.out.println("The value inverse of 8 is equal to " + myPval.getValue(8.0));

		/*
		 * The lambda expression must be compatible with the method, which is determined
		 * by the functional interface. Therefore, the following two code fragments will
		 * not work.
		 */
		// myVal = () -> "there"; // Error! The String type is incompatible with the
		// double type!
		// myPval = () -> Math.random(); // Error! Requires parameter!
	}
}