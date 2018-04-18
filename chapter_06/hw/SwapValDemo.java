package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 4
 */

public class SwapValDemo {

	public static void main(String[] args) {
		
		SwapVal ob1 = new SwapVal(2);
		SwapVal ob2 = new SwapVal(3);
		
		System.out.println("ob1 = " + ob1.a);
		System.out.println("ob2 = " + ob2.a);
		System.out.println();
		
		ob1.swap(ob1, ob2);
		
		System.out.println("ob1 = " + ob1.a);
		System.out.println("ob2 = " + ob2.a);
		
	}
}