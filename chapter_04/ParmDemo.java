package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 140
 */

public class ParmDemo {

	public static void main(String[] args) {

		ChkNum e = new ChkNum();

		if (e.isEven(10)) // Passing an argument to the isEven () method
			System.out.println("10 - even number.");

		if (e.isEven(9)) // Passing an argument to the isEven () method
			System.out.println("9 - even number.");

		if (e.isEven(8)) // Passing an argument to the isEven () method
			System.out.println("8 - even number.");

	}
}