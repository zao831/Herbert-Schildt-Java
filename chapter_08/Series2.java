package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 317
 * Implements
 */

public interface Series2 {

	int getNext(); // return the next number in order

	// Return an array that contains n elements located in a row after the current
	// element
	default int[] getNextArray(int n) {
		
		int[] vals = new int[n];

		for (int i = 0; i < n; i++)
			vals[i] = getNext();
		return vals;
	}

	void reset(); // Reset

	void setStart(int x); // Set initial value
	
}