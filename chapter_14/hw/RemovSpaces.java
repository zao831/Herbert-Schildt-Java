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

public class RemovSpaces {

	public static void main(String[] args) {

		String inStr = "Lambda expression expands Java";
		String outStr;

		System.out.println("Input string: " + inStr);
		System.out.println();

		/*
		 * This lambda-expression remove the spaces. It is injected directly into the
		 * call to the changeStr () method.
		 */
		outStr = changeStr((str) -> str.replace(" ", ""), inStr);
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