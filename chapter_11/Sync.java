package chapter_11;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 417
 */

public class Sync {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		MyThread5 mt1 = new MyThread5("Child #1", a);
		MyThread5 mt2 = new MyThread5("Child #2", a);

	}
}