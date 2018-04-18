package chapter_08.bookpackext;

import chapter_08.bookpack.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 299
 * Apply import
 */

public class UseBook2 {

	public static void main(String[] args) {

		Book[] books = new Book[5];

		books[0] = new Book("Java: A Beginner's " + "Guide", "Schildt", 2011);
		books[1] = new Book("Java: The Complete Reference", "Schldt", 20011);
		books[2] = new Book("The Art of Java", "Schildt and Holmes", 2003);
		books[3] = new Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book("On the Road", "Kerouac", 1955);

		for (int i = 0; i < books.length; i++)
			books[i].show();

	}
}