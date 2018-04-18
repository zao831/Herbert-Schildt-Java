package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 525
 */

public class MethodRefDemo {

	// In this method, the type of the first parameter is the functional interface.
	// Therefore, it can pass a reference to any instance of this interface,
	// including an instance created by reference to the method
	static boolean numTest(IntPredicate p, int v) {
		return p.test(v);
	}

	public static void main(String[] args) {
		boolean result;

		// Here, passed to the method numTest () a reference on the method isPrime ()
		result = numTest(MyintPredicates::isPrime, 17);
		if (result)
			System.out.println("17 - is prime number");

		// Here, passed to the method numTest () a reference on the method isEven ()
		result = numTest(MyintPredicates::isEven, 12);
		if (result)
			System.out.println("12 - is even number");

		// Here, passed to the method numTest () a reference on the method isPositive ()
		result = numTest(MyintPredicates::isPositive, 11);
		if (result)
			System.out.println("11 - is positive number");
	}
}