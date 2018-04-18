package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 157
 * This code displays the meaning of the keyword "this"
 */

public class DemoPwrThis {

	public static void main(String[] args) {

		PwrThisDemo x = new PwrThisDemo(4.0, 2);
		PwrThisDemo y = new PwrThisDemo(2.5, 1);
		PwrThisDemo z = new PwrThisDemo(5.7, 0);

		System.out
				.println(x.b + " in the power of " + x.e + " is equal to " + x.get_pwr() + ", Count: " + x.get_count());
		System.out
				.println(y.b + " in the power of " + y.e + " is equal to " + y.get_pwr() + ", Count: " + y.get_count());
		System.out
				.println(z.b + " in the power of " + z.e + " is equal to " + z.get_pwr() + ", Count: " + z.get_count());

	}
}
