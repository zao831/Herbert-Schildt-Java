package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 199
 * Exercise 5.3
 * Creating a class to display values in binary form
 */

public class ShowBitsDemo {

	public static void main(String[] args) {

		ShowBits2 b = new ShowBits2(8);
		ShowBits2 i = new ShowBits2(32);
		ShowBits2 li = new ShowBits2(64);

		System.out.println("123 in binary representation: ");
		b.show(123);

		System.out.println("\n87987 in binary representation: ");
		i.show(87987);

		System.out.println("\n237658768 in binary representation: ");
		li.show(237658768);

		// You can also display the lowest digits of any integer
		System.out.println("\nThe lower 8 bits of the number 87987 in the binary representation: ");
		b.show(87987);

	}
}