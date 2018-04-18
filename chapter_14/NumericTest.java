package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 507
 * Executing LambdaDemo2_0, LambdaDemo2_1
 * Use the same functional interface with three different lambda expressions.
 * The functional interface takes two parameters of type int and returns a result of type boolean.
 */

public interface NumericTest {
	boolean test(int n, int m);
}