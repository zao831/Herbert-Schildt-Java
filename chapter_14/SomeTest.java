package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 515
 * Executing GenericFunctionalinterfaceDemo
 * Using the generalized functional interface
 * Here is presented generalized functional interface with two parameters, which returns a result of type boolean
 */

public interface SomeTest<T> {
	boolean test(T n, T m);
}