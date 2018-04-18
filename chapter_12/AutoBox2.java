package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 453
*/

public class AutoBox2 {

	// This method takes an Integer parameter
	static void m(Integer v) {
		System.out.println("m() get " + v);
	}

	// This method returns a value of type int
	static int m2() {
		return 10;
	}

	// This method returns a value of type Integer
	static Integer m3() {
		return 99;
	}

	public static void main(String[] args) {

		// Passing an int value to a method m()

		// The m() method takes a parameter of type Integer, so the value of int is
		// automatically packed
		m(199);

		// The iOb object gets the int value returned by the m2 () method. This value is
		// automatically packaged so that it can be assigned to the iOb object
		Integer iOb = m2();
		System.out.println("Value, returned from m2() " + iOb);

		// Next, the m3() method returns an Integer value that is automatically unpacked
		// and converted to an int type
		int i = m3();
		System.out.println("Value, returned from m3() " + i);

		// Next, the iOb object is automatically unpack and passed to the Math.sqrt()
		// method as a parameter, and its value is incremented to the double type
		// required to perform this method
		iOb = 100;
		System.out.println("Square root of iOb: " + Math.sqrt(iOb));
	}
}