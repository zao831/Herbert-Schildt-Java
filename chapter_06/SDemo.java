package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 229
 */

public class SDemo {

	public static void main(String[] args) {

		// Create 2 StaticDemo class objects
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		// each object its own copy of the variable
		ob1.x = 10;
		ob2.x = 20;
		System.out.println("Certainly, ob1.x и ob2.x are independent");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
		System.out.println();

		// All objects share one common copy of the static variable
		System.out.println("The static variable \"y\" is the total");
		StaticDemo.y = 19;
		System.out.println("Assign StaticDemo.y to 19");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();

		StaticDemo.y = 100;
		System.out.println("Change value StaticDemo.y to 100");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();

	}
}