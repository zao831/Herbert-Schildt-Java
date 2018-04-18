package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 286
 */

public class FinalD {

	public static void main(String[] args) {

		ErrorMsg err = new ErrorMsg();

		// When a method is called, constants declared using the final keyword
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));

	}
}