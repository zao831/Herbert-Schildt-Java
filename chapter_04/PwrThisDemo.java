package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 157
 * This code displays the meaning of the keyword "this"
 */

public class PwrThisDemo {
	double val, b;
	int e;
	int count = 0;

	public PwrThisDemo(double base, int exp) {
		this.b = base;
		this.e = exp;

		val = 1;
		if (exp == 0)
			return;
		for (; exp > 0; exp--) {
			val = val * base;
			count++;
		}
	}

	double get_pwr() {
		return this.val;
	}

	int get_count() {
		return this.count;
	}
}