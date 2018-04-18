package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 231
 * Example of a static block. In this case, a static block is executed before any object is created
 * Executable - SDemo3
 */

public class StaticBlock {

	static double rootOf2;
	static double rootOf3;

	static {

		System.out.println("Inside static block");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);

	}

	StaticBlock(String msg) {
		System.out.println(msg);
	}
}