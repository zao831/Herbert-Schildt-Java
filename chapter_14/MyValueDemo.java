package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 507
 */

public class MyValueDemo {
	public static void main(String[] args) {
		MyValue myVal = () -> 98.6;
		System.out.println(myVal.getValue());
	}
}