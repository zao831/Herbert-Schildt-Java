package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 218
 */

public class TypeConv {

	public static void main(String[] args) {
		
		Overload2 ob = new Overload2();
		
		int i = 10;
		double d = 10.1;
		byte b = 99;
		short s = 10;
		float f = 11.5f;
		
		
		ob.f(i); // Calling ob.f(int)		
		ob.f(d); // Calling ob.f(double)		
		ob.f(b); // Calling ob.f(int) with a transformation		
		ob.f(s); // Calling ob.f(int) with a transformation
		ob.f(f); // Calling ob.f(double) with a transformation

	}
}