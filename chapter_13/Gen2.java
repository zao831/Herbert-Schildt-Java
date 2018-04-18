package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 499
 * Executing GenArrays
 */

public class Gen2<T extends Number> {

	T ob;

	T[] vals; // admissible

	Gen2(T o, T[] nums) {
		ob = o;

		// The next expression is inadmissible
		// vals = new T[10]; // Can not create array type Y

		// However, such an operator is admissible
		vals = nums; // Assigning a reference to an existing array is allowed
	}
}