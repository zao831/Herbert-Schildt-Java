package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 306
 */

public class SeriesDemo2 {

	public static void main(String[] args) {

		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob; // = null;

		for (int i = 0; i < 5; i++) {

			ob = twoOb;
			System.out.println("The next value ByTwos: " + ob.getNext()); // Access to the object via an interface
																			// reference

			ob = threeOb;
			System.out.println("The next value Next ByThrees: " + ob.getNext()); // Access to the object via an
																					// interface reference
			
		}
	}
}