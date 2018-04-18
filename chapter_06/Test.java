package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 212
 * Methods of transferring the arguments to the method by calling by value / by reference. Simple data types are passed to methods by value
 * Executable - CallByValue class
 */

public class Test {

	// This method can not change the values of the arguments passed to it when it
	// is called
	void noChange(int i, int j) {
		i = i + j;
		j = -j;

	}
}