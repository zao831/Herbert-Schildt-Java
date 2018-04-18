package chapter_01.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 54
 * Questions and exercises 
 * for self-examination
 * Question number 9
 * Inches per meter
*/

public class WeightOnMoon {

	public static void main(String[] args) {
		
		double w = 80;

		System.out.println("At a weight of 80 kilograms, your weight on the moon is: " + (w * 0.17) + " kilograms");

		System.out.println(
				"At a weight of " + w + " kilograms, your weight on the moon is: " + (w * 0.17) + " kilograms");

	}
}
