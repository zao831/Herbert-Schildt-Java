package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 156
 */

public class DemoPwr {

	public static void main(String[] args) {

		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);

		System.out
				.println(x.b + " in the power of " + x.e + " is equal to " + x.get_pwr() + ", Count: " + x.get_count());
		System.out
				.println(y.b + " in the power of " + y.e + " is equal to " + y.get_pwr() + ", Count: " + y.get_count());
		System.out
				.println(z.b + " in the power of " + z.e + " is equal to " + z.get_pwr() + ", Count: " + z.get_count());

	}
}