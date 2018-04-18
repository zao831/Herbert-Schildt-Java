package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 302
 */

public class SeriesDemo {

	public static void main(String[] args) {

		ByTwos ob = new ByTwos();

		for (int i = 0; i < 5; i++)
			System.out.println("he next value: " + ob.getNext());

		System.out.println("\nReset");
		ob.reset();
		for (int i = 0; i < 5; i++)
			System.out.println("he next value: " + ob.getNext());

		System.out.println("\nInitial valueе: 100");
		ob.setStart(100);
		for (int i = 0; i < 5; i++)
			System.out.println("he next value: " + ob.getNext());

	}
}
