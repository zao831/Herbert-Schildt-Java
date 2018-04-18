package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 46
 * Exercise 1.2
 * The program for translating gallons into liters
 */

public class GalToLitТаblе {

	public static void main(String[] args) {
		
		double gallons, liters;
		int counter;

		counter = 0;
		for (gallons = 1; gallons <= 30; gallons++) {
			liters = gallons * 3.7854; // Gallons into liters
			System.out.println(gallons + " gallon corresponds " + liters + " liters.");
			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0; // Count reset
			}
		}

	}
}
