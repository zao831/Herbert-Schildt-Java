package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 230
 * Appeal to the class StaticMeth
 */

public class SDemo2 {

	public static void main(String[] args) {

		System.out.println("Value val: " + StaticMeth.val);
		System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

		StaticMeth.val = 4;
		System.out.println("Value val: " + StaticMeth.val);
		System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

	}
}