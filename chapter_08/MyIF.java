package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 315
 * Implements MyClass
 */

public interface MyIF {

	// Declaring an "ordinary" interface method that does NOT include a default
	// implementation definition
	int getUserID();

	// The default method definition, including its implementation
	default int getAdminID() {
		return 1;
	}
}