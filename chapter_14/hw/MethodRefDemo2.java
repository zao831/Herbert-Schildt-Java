package chapter_14.hw;

import chapter_14.IntPredicate;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 16
 */

public class MethodRefDemo2 {

	public static void main(String[] args) {

		boolean result;
		MyIntNum myNum = new MyIntNum(12);
		IntPredicate ip = myNum::hasCommonFactor;
		result = ip.test(9);
		if (result)
			System.out.println(
					"The hasCommonFactor() method argument is of type int. The value of the argument passed in the method and the value stored in the calling MyIntNum object have at least one common divisor.");
		else
			System.out.println("Fatal error!");
	}
}