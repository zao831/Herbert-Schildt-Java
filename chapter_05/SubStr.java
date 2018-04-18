package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 187
 * Using the substring() method
 */

public class SubStr {

	public static void main(String[] args) {

		String orgstr = "Java is the engine of the Internet.";
		System.out.println("Length orgstr: " + orgstr.length());

		// Generate a substring
		String substr = orgstr.substring(7, 35);

		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);

	}
}