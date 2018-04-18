package chapter_03.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 125
 * Questions and exercises for self-examination
 * Question number 9
 */

public class ForGeoProgres {

	public static void main(String[] args) {
		
		int j = 1;

		for (int i = 1; i < 8; i++) {
			
			System.out.println(j);
			j *= 2; // j = j + j;
			
		}
	}
}
