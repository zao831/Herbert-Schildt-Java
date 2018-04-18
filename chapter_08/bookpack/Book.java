package chapter_08.bookpack;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 292
 * Executing BookDemo,
 * UseBook, UseBook2 
 * (package chapter_8.bookpackext;)
 */

public class Book {
	
	private String title;
	private String author;
	private int pubDate;

	public Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}