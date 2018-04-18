package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 516
 * Exercise 14.1
 */

public class LambdaArgurnentDemo {

	public static void main(String[] args) {

		String inStr = "Lambda expression expands Java";
		String outStr;

		System.out.println("Input string: " + inStr);
		System.out.println();

		/*
		 * Define a lambda-expression that holds the contents of the string in reverse
		 * order, and assign it to a variable that references the StringFunc instance.
		 */
		StringFunc revarse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};

		/*
		 * Pass the reverse_variable to the changeStr () method as the first argument.
		 * Pass the input string as the second argument.
		 */
		outStr = changeStr(revarse, inStr);
		System.out.println("Reverse String: " + outStr);
		System.out.println();

		/*
		 * It is not necessary to assign a lambda-expression to a variable. It is
		 * allowed to transfer to the method him.
		 */
		System.out.println("Passing the lambda-expression to method as a variable: ");
		outStr = changeStr((str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		}, inStr);
		System.out.println("Reverse String: " + outStr);
		System.out.println();

		/*
		 * This lambda-expression replaces the spaces with dashes. It is injected
		 * directly into the call to the changeStr () method.
		 */
		outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
		System.out.println("String with replaced spaces: " + outStr);
		System.out.println();

		/*
		 * This block lambda-expression reverse the register of letters in the string.
		 * It is injected directly into the call to the changeStr () method.
		 */
		outStr = changeStr((str) -> {
			String result = "";
			char ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (Character.isUpperCase(ch))
					result += Character.toLowerCase(ch);
				else
					result += Character.toUpperCase(ch);
			}
			return result;
		}, inStr);
		System.out.println("A string with a reversed case of letters: " + outStr);
		System.out.println();

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