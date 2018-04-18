package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 13
 */

public class RetSumDemo {

	public static void main(String[] args) {

		RetSum ob = new RetSum();

		int sum = ob.sum(10, 20, 30);

		System.out.println("Sum = " + sum);

	}
}