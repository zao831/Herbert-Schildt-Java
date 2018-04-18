package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 301
 * ByTwos, ByTwos2, ByThrees
 */

public interface Series {
	
	int getNext(); // return the next number in order

	void reset(); // Reset

	void setStart(int x); // Set initial value
	
}
