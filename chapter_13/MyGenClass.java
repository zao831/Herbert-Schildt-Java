package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 497
 * Ambiguity caused by cleaning overloaded methods
 */

public class MyGenClass<T, V> {

	T ob1;
	V ob2;

	// ...

	/*
	 * These two declarations of overloaded methods generate ambiguity, and
	 * therefore the code is not compiled
	 */
	// void set(T o) {
	// ob1 = o;
	// }

	// void set(V o) {
	// ob2 = o;
	// }
}