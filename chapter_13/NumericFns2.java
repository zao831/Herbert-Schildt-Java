package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 478
 * Executing WildcardDemo
 */

public class NumericFns2<T extends Number> {
	T num;

	// Pass the constructor a reference on the numeric object
	NumericFns2(T n) {
		num = n;
	}

	// Return the reverse value
	double reciprocal2() {
		return 1 / num.doubleValue();
	}

	// Return the fractional part
	double fraction2() {
		return num.doubleValue() - num.intValue();
	}

	// Check the equality of the absolute values of two objects
	boolean absEqual(NumericFns2<?> ob) {
		if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}