package chapter_01;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 42
 * Demonstration of the use of variables
 */

public class Example2 {

	public static void main(String[] args) {
		
		int var1;
		int var2;
		
		var1 = 1024;
		System.out.println("Variable var1 contains " + var1);
		
		var2 = var1 / 2;
		System.out.print("Variable var2 contains var1 / 2: ");
		System.out.println(var2);

	}
}
