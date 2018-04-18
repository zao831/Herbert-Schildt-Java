package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 526
 * Associated class MethodRefDemo2, MethodRefDemo3
 * This class stores an int value and defines the isFactor () method, which returns true if its argument is a divisor of the number stored in the class
 */

public class MyIntNum {

	private int v;

	MyIntNum(int x) {
		v = x;
	}

	int getNum() {
		return v;
	}

	// Return true if n divisor v
	boolean isFactor(int n) {
		return (v % n) == 0;
	}
}