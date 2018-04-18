package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 521
 */

public class VarCapture {

	public static void main(String[] args) {

		// local variable that can be captured
		int num = 10;

		MyFunc myLambda = (n) -> {
			// This use of the variable num is correct, since its values do not change
			int v = num + n;

			// The following statement is not valid, because it changes the value of num
			// num++;
			return v;
		};

		// Using lambda-expression. This instruction displays the number 18
		System.out.println(myLambda.func(8));

		/*
		 * The following line would cause an error, since it deprives variable "num" of
		 * the status of the final variable
		 */
		// num = 9;
	}
}