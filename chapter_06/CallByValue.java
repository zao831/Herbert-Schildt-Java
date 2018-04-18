package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 212
 */

public class CallByValue {

	public static void main(String[] args) {

		Test ob = new Test();

		int a = 15, b = 20;
		
		System.out.println("a и b before calling: " + a + " " + b); // 15, 20
	
		ob.noChange(a, b);
		
		System.out.println("a и b after calling: " + a + " " + b); // 15, 20
		
	}
}