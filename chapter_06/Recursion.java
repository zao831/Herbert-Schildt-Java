package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 226
 */

public class Recursion {

	public static void main(String[] args) {

		Factorial f = new Factorial();

		System.out.println("Computation by the recursive method");
		System.out.println("The factorial 3 is equal to " + f.factR(3));
		System.out.println("The factorial 4 is equal to " + f.factR(4));
		System.out.println("The factorial 5 is equal to " + f.factR(5));
		System.out.println();

		System.out.println("Computation by the Iterative method");
		System.out.println("The factorial 3 is equal to " + f.factI(3));
		System.out.println("The factorial 4 is equal to " + f.factI(4));
		System.out.println("The factorial 5 is equal to " + f.factI(5));
		System.out.println();

	}
}