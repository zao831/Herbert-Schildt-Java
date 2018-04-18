package chapter_08.bookpack;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 296
 * Subclass ExtBook (package chapter_8.bookpackext;)
 */

public class Book2 {
	
	protected String title;
	protected String author;
	protected int pubDate;

	public Book2(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
//		System.out.println();
	}
}