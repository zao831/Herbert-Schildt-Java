package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 530
 * Associated class ConstructorRefDemo
 */

public class MyClass {

	private String str;

	// This conctrustor takes aragument
	public MyClass(String s) {
		str = s;
	}

	// This constructor default
	public MyClass() {
		str = "";
	}

	String getStr() {
		return str;
	}
}