package chapter_14.hw;

import chapter_14.StringFunc;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 534
 * Questions and exercises 
 * for self-examination
 * Question number 9
 */

public class RemovSpaces2 {

	public static void main(String[] args) {

		String inStr = "Lambda expression expands Java";
		String outStr;

		System.out.println("Input string: " + inStr);
		System.out.println();

		StringFunc remove = (str) -> {
			String result = "";

			for (int i = 0; i < str.length(); i++)
				if (str.charAt(i) != ' ')
					result += str.charAt(i);
			return result;
		};

		outStr = changeStr(remove, inStr);
		System.out.println("Input string with remove spaces: " + outStr);

	}

	/*
	 * In this method, the type of the first parameter is the functional interface.
	 * Therefore, it can pass a reference to any instance of this interface,
	 * including the instance created by the lambda-expression. The second parameter
	 * specifies the string to be processed.
	 */
	static String changeStr(StringFunc sf, String s) {
		return sf.func(s);
	}
}