package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 46
 * Exercise 1.1
 * The program for translating gallons into liters
 */

public class GalToLit {
	public static void main(String[] args) {
		
		double gallons; // In this variable, a value expressing the volume of liquid in gallons is stored

		double liters; // In this variable, a value expressing the volume of liquid in liters is stored

		gallons = 10; // Initial value correspondent 10 gallon

		liters = gallons * 3.7854; // Translate in liter

		System.out.println(gallons + " gallons corresponds " + liters + " liter");
	}
}
