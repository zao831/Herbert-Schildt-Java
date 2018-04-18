package chapter_12.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 463
 * Questions and exercises 
 * for self-examination
 * Question number 3
 */

public class EnumToolsDemo {

	enum Tools {
		SCREWDRIVER, WRENCH, НАММЕR, PLIERS
	}

	public static void main(String[] args) {

		for (Tools t : Tools.values()) {
			System.out.println(t + ": " + t.ordinal());
		}
	}
}