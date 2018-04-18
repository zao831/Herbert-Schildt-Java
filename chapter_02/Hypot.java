package chapter_02;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 60
 * The length of the hypotenuse, based on the length of the cathetuses, is determined by the Pythagorean theorem
*/

public class Hypot {

	public static void main(String[] args) {
		double x, y, z;

		x = 3;
		y = 4;

		z = Math.sqrt(x * x + y * y);
		System.out.println("The length of the hypotenuse: " + z);

	}

}
