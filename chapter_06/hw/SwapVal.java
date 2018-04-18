package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 4
 * Executing - SwapValDemo
 */

public class SwapVal {

	int a;

	public SwapVal(int i) {
		a = i;
	}

	void swap(SwapVal ob1, SwapVal ob2) {
		int t;

		t = ob1.a;
		ob1.a = ob2.a;
		ob2.a = t;
	}
}