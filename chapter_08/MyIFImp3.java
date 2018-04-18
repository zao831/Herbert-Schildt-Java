package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 */

public interface MyIFImp3 {

	// Declaring a regular interface method that does NOT include a default
	// implementation definition
	int getUserID();

	// The default method declaration, including its implementation
	default int getAdminID() {
		return 1;
	}

	// Declaring a static interface method no implementation of the MyIFImp3
	// interface or the creation of its instance is required, since it is static.
	// Similarly - static methods are not inherited by either the implementing class
	// or the derived interfaces.
	static int getUniversalID() {
		return 0;
	}

	// Call static method
	int uID = MyIFImp3.getUniversalID();

}
