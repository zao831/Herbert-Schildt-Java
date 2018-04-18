package chapter_02;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 64
 * Exercise 2.1
 * Calculate the distance to the place of the flash of lightning, the sound of which reaches the observer after 7.2 seconds. 
 * The sound spreads around 1100 feet per second
 */

public class Sound {

	public static void main(String[] args) {
		
		double dist;
		dist = 1100 * 7.2;

		System.out.println("The distance to the lightning flash point is " + dist + " feet");

	}
}
