package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 205
 */

public class MyClass {

	private int alpha; // closed type
	public int beta; // open type
	int gamma; // open type

	// Methods for accessing the alpha variable. Class members can access private
	// members of the same class
	void setAlpha(int a) {
		alpha = a;
	}

	int getAlpha() {
		return alpha;
	}
}