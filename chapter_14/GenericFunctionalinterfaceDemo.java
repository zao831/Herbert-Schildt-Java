package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 515
 */

public class GenericFunctionalinterfaceDemo {
	
	public static void main(String[] args) {
		
		// This lambda expression determines whether one integer is a divisor of another
		SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

		if (isFactor.test(10, 2))
			System.out.println("2 is a divisor of 10");
		System.out.println();

		// This lambda-expression determines whether a single number of type Double is a
		// divisor of another
		SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

		if (isFactorD.test(212.0, 4.0))
			System.out.println("4.0 is a divisor of 212.0");
		System.out.println();

		// This lambda expression determines whether one line is part of another
		SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

		String str = "Functionalized functional interface";

		System.out.println("The string to be tested: " + str);

		if (isIn.test(str, "face"))
			System.out.println("'face' find");
		else
			System.out.println("'face' not find");

	}
}