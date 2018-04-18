package chapter_08.bookpackext;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 296
 * Super class Book2 (package chapter_8.bookpack;)
 * Executing ProtectDemo
 */

public class ExtBook extends chapter_08.bookpack.Book2 {

	private String publisher;

	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publisher = p;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String p) {
		publisher = p;
	}

	// The following statements are allowed, since subclasses have the right to
	// access members of the class declared protected

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		title = t;
	}

	public String getAutor() {
		return author;
	}

	public void setAutor(String a) {
		author = a;
	}

	public int getPubDate() {
		return pubDate;
	}

	public void setPubDate(int p) {
		pubDate = p;
	}
}