package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 462
*/

@Deprecated
public class MyClass {
	private String msg;

	public MyClass(String m) {
		msg = m;
	}

	@Deprecated
	String getMsg() {
		return msg;
	}
}