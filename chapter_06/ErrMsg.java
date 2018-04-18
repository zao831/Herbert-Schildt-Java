package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 214
 */

public class ErrMsg {

	public static void main(String args[]) {

		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(19));

	}
}