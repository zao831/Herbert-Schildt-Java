package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 524
 * Executing MethodRefDemo (Demonstration of using references to static methods), MethodRefDemo2 (Use the reference to the instance method)
 * A functional interface for numeric predicates that affect integer values
 */

public interface IntPredicate {
	boolean test(int n);
}