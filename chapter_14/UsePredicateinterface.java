package chapter_14;

import java.util.function.Predicate;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 533
 * Using the built-in function interface Predicate
 */

public class UsePredicateinterface {

	public static void main(String[] args) {

		// This lambda expression uses the Predicate <Integer> interface to determine
		// whether the given number is even
		Predicate<Integer> isEven = (n) -> (n % 2) == 0;

		if (isEven.test(4))
			System.out.println("4 is even number");
		if (!isEven.test(5))
			System.out.println("5 is not even number");

	}
}