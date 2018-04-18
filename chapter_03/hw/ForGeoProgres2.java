package chapter_03.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 125
 * Questions and exercises for self-examination
 * Question number 9
 * Version 2.0
 */

public class ForGeoProgres2 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i += i)

			System.out.print(i + " ");

	}
}
