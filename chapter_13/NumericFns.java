package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 475
 * Executing BoundsDemo
 * An example of the NumericFns class is shown on page 474, as an example of an unsuccessful attempt to create a generalize class. In this version of the NumericFns class, an argument of the type replacing a parameter of type T must be the Number class or a subclass derived from it, as shown below.
*/

public class NumericFns<T extends Number> {

	T num;

	// Pass the constructor a reference on the numeric object
	NumericFns(T n) {
		num = n;
	}

	// Return the reverse value
	double reciprocal() {
		return 1 / num.doubleValue();
	}

	// Return the fractional part
	double fractation() {
		return num.doubleValue() - num.intValue();
	}
}