package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 476
 */

public class BonusDemo {

	public static void main(String[] args) {

		NumericFns<Integer> iOb = new NumericFns<Integer>(5); // It is permissible, because Integer is a subclass of
																// Number

		System.out.println("iOb - " + iOb.reciprocal());
		System.out.println("iOb - " + iOb.fractation());
		System.out.println();

		NumericFns<Double> dOb = new NumericFns<Double>(5.25); // Type Double also permissible

		System.out.println("dOb - " + dOb.reciprocal());
		System.out.println("dOb - " + dOb.fractation());
		System.out.println();

		// The next line of code will not be compiled, since the String class is not
		// derived from the Number class.
		// NumericFns<String> name = new NumericFns<String>("Error"); // This is error
		// (String can't to be use)
	}
}
