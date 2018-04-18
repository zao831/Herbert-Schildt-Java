package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 315
 * Implements MyClass
 */

public interface MyIF2 {

	// Declaring an "ordinary" interface method that does NOT include a default
	// implementation definition
	int getUserID();

	// The default method definition, including its implementation
	default int getAdminID() {
		return 1;
	}

	// Declaring a static interface method
	static int getUniversalID() {
		return 0;
	}

	// An example of calling the getUniversalID () method: int uID =
	// MyIF2.getUniversalID ();

}
