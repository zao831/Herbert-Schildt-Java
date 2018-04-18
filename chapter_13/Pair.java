package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 476
 * Executing PairDemo
 */

public class Pair<T, V extends T> {
	T first;
	V second;

	Pair(T a, V b) {
		first = a;
		second = b;
	}
}