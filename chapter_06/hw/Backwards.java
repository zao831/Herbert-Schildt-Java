package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 6
 * Executing - BWDemo
 */

public class Backwards {

	String str;

	public Backwards(String s) {
		str = s;
	}

	void backwards(int idx) {
		if (idx != str.length() - 1)
			backwards(idx + 1);

		System.out.print(str.charAt(idx));

	}

	void leng() {
		System.out.println("\nlength = " + str.length());
	}
}