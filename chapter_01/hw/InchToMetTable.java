package chapter_01.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 54
 * Questions and exercises 
 * for self-examination
 * Question number 10
 * Inches per meter
*/

public class InchToMetTable {

	public static void main(String[] args) {
		
		double inch, meter;
		int counter;

		counter = 0;
		for (inch = 1; inch <= 40; inch++) {
			meter = inch / 39.37; // Inches per meter
			System.out.println(inch + " inches corresponds " + meter + " meter");

			counter++; // increase string counter
			if (counter == 12) { // every 12th line is empty
				System.out.println();
				counter = 0; // Reset strings counter
			}
		}
	}
}
