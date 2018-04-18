package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 452
*/

public class Wrap {
	public static void main(String[] args) {

		Integer iOb = new Integer(100);
		int i = iOb.intValue();
		System.out.println(i + " " + iOb);

	}
}