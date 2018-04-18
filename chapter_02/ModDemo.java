package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 73
 * Demonstration of the division operation modulo
 */

public class ModDemo {

	public static void main(String[] args) {
		int iresult, irem;
		double dresult, drem;

		iresult = 10 / 3;
		irem = 10 % 3;

		dresult = 10.0 / 3.0;
		drem = 10.0 % 3.0;

		System.out.println("Result and remainder of division " + "10 / 3: " + iresult + " и " + irem);
		System.out.println("Result and remainder of division " + "10.0 / 3.0: " + dresult + " и " + drem);

	}
}
