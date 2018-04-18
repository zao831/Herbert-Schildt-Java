package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 526
 */

public class MethodRefDemo2 {

	public static void main(String[] args) {

		boolean result;

		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);

		// Create a reference ip to the isFactor() method of myNum object
		IntPredicate ip = myNum::isFactor;

		// Use the reference to call the isFactor() method via the test() method
		result = ip.test(3);
		if (result)
			System.out.println("3 is divisor " + myNum.getNum());

		// Create a reference ip to the isFactor() method of myNum object and Use the
		// reference to call the isFactor() method via the test() methodF
		ip = myNum2::isFactor;
		result = ip.test(3);
		if (!result)
			System.out.println("3 is not divisor " + myNum2.getNum());
	}
}