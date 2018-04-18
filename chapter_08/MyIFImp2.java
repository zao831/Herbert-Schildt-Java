package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 316
 * Executing DefaultMethodDemo2
 */

public class MyIFImp2 implements MyIF {

	// Implementations of both methods are provided - getUserID () and getAdminID ()
	public int getUserID() {
		return 100;
	}

	public int getAdminID() {
		return 42;
	}
}
