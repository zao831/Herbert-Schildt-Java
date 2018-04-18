package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 472
 */

public class SimpGen {

	public static void main(String[] args) {

		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generalizations");

		// Types display
		tgObj.showTypes();

		// Get and display values
		int v = tgObj.getOb1();
		System.out.println("Value: " + v);

		String str = tgObj.getOb2();
		System.out.println("Value: " + str);
		
	}
}