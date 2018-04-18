package chapter_09;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 339
 */

public class FinallyDemo {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}