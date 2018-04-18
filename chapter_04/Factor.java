package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 141
 */

public class Factor {

	boolean isFactor(int a, int b) { // This method has two parameters

		if ((b % a) == 0)
			return true;
		else
			return false;

	}
}
