package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 221
 * Address to class MyClass. Create objects. Pass the values to the constructor. MyClass constructor is reloaded 4 times
 */

public class OverloadConsDemo {

	public static void main(String[] args) {

		MyClass1 t1 = new MyClass1();
		MyClass1 t2 = new MyClass1(88);
		MyClass1 t3 = new MyClass1(17.23);
		MyClass1 t4 = new MyClass1(2, 4);

		System.out.println("t1.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);
		System.out.println("t3.x: " + t3.x);
		System.out.println("t4.x: " + t4.x);

	}
}