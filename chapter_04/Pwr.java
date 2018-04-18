package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 156
 * Execute DemoPwr class
 */

public class Pwr {
	double val, b;
	int e;
	int count = 0;

	public Pwr(double base, int exp) {
		b = base;
		e = exp;

		val = 1;
		if (exp == 0)
			return;
		for (; exp > 0; exp--) {
			val = val * base;
			count++;
		}
	}

	double get_pwr() {
		return val;
	}

	int get_count() {
		return count;
	}
}