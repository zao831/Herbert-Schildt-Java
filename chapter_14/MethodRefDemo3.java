package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 528
 */

public class MethodRefDemo3 {

	public static void main(String[] args) {

		boolean result;

		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);

		// Create an inp reference to the isFactor () method.
		MyintNumPredicate inp = MyIntNum::isFactor;

		// Call the isFactor () method for the myNum object
		result = inp.test(myNum, 3);
		if (result)
			System.out.println("3 is divisor " + myNum.getNum());

		// Call the isFactor () method for the myNum2 object
		result = inp.test(myNum2, 3);
		if (!result)
			System.out.println("3 is not divisor " + myNum2.getNum());
	}
}