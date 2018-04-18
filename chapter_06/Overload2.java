package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 218
 * Execute TypeConv
 */

public class Overload2 {

	void f(int x) {
		System.out.println("Inside f(int): " + x);
	}

	void f(double x) {
		System.out.println("Inside f(double): " + x);

	}
}