package chapter_13;

/* 
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 478
 * Demonstration using the template argument
 */

public class WildcardDemo {

	public static void main(String[] args) {

		NumericFns2<Integer> iOb = new NumericFns2<Integer>(6);
		NumericFns2<Double> dOb = new NumericFns2<Double>(-6.0);
		NumericFns2<Long> lOb = new NumericFns2<Long>(5L);

		System.out.println("Comparison of iOb and dOb");
		if (iOb.absEqual(dOb)) // In this method call, the type of the template-argument is the same as the
								// Double type
			System.out.println("Absolute values are the same.");
		else
			System.out.println("Absolute values are different.");

		System.out.println();

		System.out.println("Comparison of iOb and lOb");
		if (iOb.absEqual(lOb)) // In this method call, the type of the template-argument is the same as the
								// Long type
			System.out.println("Absolute values are the same.");
		else
			System.out.println("Absolute values are different.");

	}
}