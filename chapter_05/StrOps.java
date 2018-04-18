package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 184
 * Some operations on strings
 */

public class StrOps {

	public static void main(String[] args) {

		String str1 = "Java is the leader of the Internet!";
		String str2 = new String(str1);
		String str3 = new String("Java strings are effective");
		int result, idx;
		// char ch;

		System.out.println("Length str1: " + str1.length());
		System.out.println("Length str3: " + str3.length());
		System.out.println();

		// Display string by character
		for (int i = 0; i < str1.length(); i++)
			System.out.print(str1.charAt(i));
		System.out.println("\n");

		if (str1.equals(str2))
			System.out.println("str1 is equivalent to str2");
		else
			System.out.println("str1 is not equivalent to str2");
		System.out.println();

		if (str1.equals(str3))
			System.out.println("str1 is equivalent to str3");
		else
			System.out.println("str1 is not equivalent to str3");
		System.out.println();

		result = str1.compareTo(str3);
		if (result == 0)
			System.out.println("str1 and str3 are equal");
		else if (result < 0)
			System.out.println("str1 less than str3");
		else
			System.out.println("str1 more str3");
		System.out.println();

		// Assigning a new line to str2
		str2 = "One Two Three One";
		System.out.println("Length str2: " + str2.length());

		idx = str2.indexOf("One");
		System.out.println("First entrance index One: " + idx);
		idx = str2.lastIndexOf("One");
		System.out.println("Last entrance index One: " + idx);

	}
}