package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 486
 */

public class GenIFDemo {

	public static void main(String[] args) {

		Integer[] x = { 1, 2, 3 };

		MyClass<Integer> ob = new MyClass<Integer>(x);

		if (ob.contains(2))
			System.out.println("2 is contained in ob");
		else
			System.out.println("2 is not contained in ob");

		if (ob.contains(5))
			System.out.println("5 is contained in ob");
		else
			System.out.println("5 is not contained in ob");

		// The following lines of code are not valid, since the ob object is an
		// implementation of the Containment interface for the Integer type, and the
		// value of 9.25 is of the Double type

		// if (ob.contains(9.25)) System.out.println("9.25 is contained in ob");
	}
}