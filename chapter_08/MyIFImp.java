package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 315
 * Executing DefaultMethodDemo
 */

public class MyIFImp implements MyIF {

	// Implementation is only a method getUserID () do this for the method
	// getAdminID () is optional, because if necessary, its implementation can be
	// used by default.

	public int getUserID() {
		return 100;
	}
}
