package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 260
 * Super class A
 * Executing UseSuper
 */

public class B extends A {

	int i; // This variable hides the variable "i" from class A

	B(int a, int b) {
		super.i = a; // variable "i" from class A
		i = b; // variable "i" from class B
	}

	void show() {

		System.out.println("\"i\" in superclass: " + super.i);
		System.out.println("\"i\" in subclass: " + i);
	}
}