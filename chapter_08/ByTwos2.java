package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 303
 * Implementing the Series Interface
 * getPrevious method added
 * Executing ...
 */

public class ByTwos2 implements Series {
	int start;
	int val;
	int prev;

	ByTwos2() {
		start = 0;
		val = 0;
		prev = -2;
	}

	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}

	public void reset() {
		start = 0;
		val = 0;
		prev = -2;
	}

	public void setStart(int x) {
		start = x;
		val = x;
		prev = x - 2;
	}

	int getPrevious() {
		return prev;
	}
}