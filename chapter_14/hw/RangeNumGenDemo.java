package chapter_14.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 6
 */

public class RangeNumGenDemo {

	public static void main(String[] args) {

		MyTestGen<Integer> myNum = n -> (n >= 10 && n <= 20);

		if (myNum.testing(15))
			System.out.println("The number is in the specified range");
		else
			System.out.println("The number is outside the specified range");

		if (myNum.testing(7))
			System.out.println("The number is in the specified range");
		else
			System.out.println("The number is outside the specified range");

		if (myNum.testing(20))
			System.out.println("The number is in the specified range");
		else
			System.out.println("The number is outside the specified range");

	}
}