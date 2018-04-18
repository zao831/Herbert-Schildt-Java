package chapter_14.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 16
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

	boolean hasCommonFactor(int n) {
		for (int i = 2; i < v / i; i++)
			if (((v % i) == 0) && ((n % i) == 0))
				return true;
		return false;
	}
}