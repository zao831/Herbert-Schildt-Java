package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 476
 */

public class PairDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Pair<Integer, Integer> x = new Pair<Integer, Integer>(1, 2);
		Pair<Number, Integer> y = new Pair<Number, Integer>(10.4, 12);

		// This line of code is not valid, because String is not a subclass of Number
		// Pair<Number, String> z = new Pair<Number, String>(10.4, 12); // Error
	}
}