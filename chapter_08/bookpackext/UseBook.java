package chapter_08.bookpackext;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 296
 */

public class UseBook {

	public static void main(String[] args) {

		chapter_08.bookpack.Book books[] = new chapter_08.bookpack.Book[5];

		books[0] = new chapter_08.bookpack.Book("Java: A Beginner's " + "Guide", "Schildt", 2011);
		books[1] = new chapter_08.bookpack.Book("Java: The Complete Reference", "Schldt", 2011);
		books[2] = new chapter_08.bookpack.Book("The Art of Java", "Schildt and Holmes", 2003);
		books[3] = new chapter_08.bookpack.Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new chapter_08.bookpack.Book("On the Road", "Kerouac", 1955);

		for (int i = 0; i < books.length; i++)
			books[i].show();

	}
}