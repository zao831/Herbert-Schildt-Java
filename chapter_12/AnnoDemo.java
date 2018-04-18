package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 463
*/

public class AnnoDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		MyClass myObj = new MyClass("Test");

		System.out.println(myObj.getMsg());
	}
}
