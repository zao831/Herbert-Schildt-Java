package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 302
 * Implementing the Series Interface
 * Executing SeriesDemo, SeriesDemo2
 */

public class ByTwos implements Series {
	int start;
	int val;

	ByTwos() {
		start = 0;
		val = 0;
	}

	// The method is declared open
	public int getNext() {
		val += 2;
		return val;
	}

	// The method is declared open
	public void reset() {
		start = 0;
		val = 0;
	}

	// The method is declared open
	public void setStart(int x) {
		start = x;
		val = x;
	}
}