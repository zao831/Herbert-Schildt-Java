package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 268
 * Super class X1
 * Executing SupSubRef
 */

public class Y1 extends X1 {
	
	int b;

	Y1(int i, int j) {
		super(j);
		b = i;
	}
}