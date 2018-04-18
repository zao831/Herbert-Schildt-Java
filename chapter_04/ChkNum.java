package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 140
 * A simple example of applying a parameter in a method
 * Return the boolean value true if "x" contains an even number
 */

public class ChkNum {

	boolean isEven(int x) { // Here, x is the integer-valued parameter of the method isEvеn ()

		if ((x % 2) == 0)
			return true;
		else
			return false;

	}
}