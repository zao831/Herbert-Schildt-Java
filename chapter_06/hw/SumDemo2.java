package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 13
 */

public class SumDemo2 {

	public static void main(String[] args) {
		
		SumIt siObj = new SumIt();

		int total = siObj.sum(1, 2, 3);
		System.out.println("Sum: " + total);

		total = siObj.sum(1, 2, 3, 4, 5);
		System.out.println("Sum: " + total);

	}
}