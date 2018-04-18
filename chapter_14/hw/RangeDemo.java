package chapter_14.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 6
 */

public class RangeDemo {

	public static void main(String[] args) {

		MyTest rangeNum = (n) -> (n > 9 && n < 21);

		if (rangeNum.testing(15))
			System.out.println("The number is in the specified range");
		else
			System.out.println("The number is outside the specified range");

		if (rangeNum.testing(7))
			System.out.println("The number is in the specified range");
		else
			System.out.println("The number is outside the specified range");

		if (rangeNum.testing(20))
			System.out.println("The number is in the specified range");
		else
			System.out.println("The number is outside the specified range");

	}
}