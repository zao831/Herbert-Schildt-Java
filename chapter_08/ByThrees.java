package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 304
 * Another implementation 
 * of the Series interface
 * Executing SeriesDemo2
 */

public class ByThrees implements Series {
	int start;
	int val;

	ByThrees() {
		start = 0;
		val = 0;
	}

	public int getNext() {
		val += 3;
		return val;
	}

	public void reset() {
		start = 0;
		val = 0;
	}

	public void setStart(int x) {
		start = x;
		val = x;
	}
}