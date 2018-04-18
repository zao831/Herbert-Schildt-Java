package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 60
 * Calculating the number of cubic inches in a cube of 1 cube per mile
*/

public class Inches {

	public static void main(String[] args) {
		long ci;
		long im;

		im = 5280 * 12;
		ci = im * im * im;
		System.out.println("One cubic mile contains " + ci + " cubic inches");

	}

}
