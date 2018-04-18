package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 484
 * Executing GenConsDemo
 * Use generalized constructor
 */

public class Summation {

	private int sum;

	<T extends Number> Summation(T arg) { // Generalized constructor
		sum = 0;

		for (int i = 0; i <= arg.intValue(); i++)
			sum += i;
	}

	int getSum() {
		return sum;
	}
}