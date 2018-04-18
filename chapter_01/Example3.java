package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 44
 * Demonstration of the differences between types int and double
 */

public class Example3 {

	public static void main(String[] args) {
		
		int var; // Declare an integer variable
		double x; // Declare a variable with a floating point
		
		var = 10; // Assign variable var value 10
		
		x = 10.0; // Assign variable x value 10.0
		
		System.out.println("The initial value of var: " + var);
		System.out.println("The initoal value of x: " + x);
		System.out.println(); // Output an empty string
		
		// Divide the values of both variables by 4
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("The value of the variable var after division: " + var);
		System.out.println("The value of the variable x after division: " + x);

	}
}
