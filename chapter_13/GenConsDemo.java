package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 485
 */

public class GenConsDemo {

	public static void main(String[] args) {

		Summation ob = new Summation(4.0);

		System.out.println("The sum of the integers from 0 to 4.0 is " + ob.getSum());
	}
}