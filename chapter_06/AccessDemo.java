package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 206
 */

public class AccessDemo {

	public static void main(String[] args) {

		MyClass ob = new MyClass();

		// Access to the variable alpha from MyClass is possible only with the help of
		// methods specially designed for this purpose
		ob.setAlpha(-99);
		System.out.println("ob.alpha: " + ob.getAlpha());

		// Refer to the variable alpha - ob.alpha = 10; it is impossible, since alpha is
		// a closed variable. To the other variables, direct access is allowed, since
		// they are open
		ob.beta = 88;
		ob.gamma = 99;

	}
}