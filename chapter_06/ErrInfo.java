package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 215
 */

public class ErrInfo {

	public static void main(String[] args) {

		ErrorInfo err = new ErrorInfo();
		Err e;

		e = err.getErrorInfo(2);
		System.out.println(e.msg + " level: " + e.severity);

		e = err.getErrorInfo(19);
		System.out.println(e.msg + " level: " + e.severity);

	}
}