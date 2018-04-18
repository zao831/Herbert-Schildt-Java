package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 528
 * Executing MethodRefDemo3
 * Using a reference to an instance method to access any interface
 * A functional interface for numeric predicates that affect an object of type MyintNurn and an integer value
 */

public interface MyintNumPredicate {
	boolean test(MyIntNum mv, int n);
}