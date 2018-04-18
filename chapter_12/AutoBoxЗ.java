package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 455
*/

public class AutoBoxЗ {

	public static void main(String[] args) {

		Integer iOb, iOb2;
		int i;

		iOb = 99;
		System.out.println("The initial value of iOb: " + iOb);

		// In the next expression, the iOb object is automatically unpack, the
		// calculations are performed, and the result is again packed into the iOb
		// object
		++iOb;
		System.out.println("After ++iOb: " + iOb);

		// Here the iOb object is automatically unpack, to the obtained value is added
		// 10, and the result is again packed into the iOb object
		iOb += 10;
		System.out.println("After iOb += 10: " + iOb);

		// Here the iOb object is automatically unpack, the calculations are performed,
		// and the result is again packed_into the iOb object
		iOb2 = iOb + (iOb / 3);
		System.out.println("iOb2 after the expression calculation: " + iOb2);

		// The same expression is executed, but the repeated packing is not performed
		i = iOb + (iOb / 3);
		System.out.println("i after the expression calculation: " + i);

		System.out.println();

		// Herbert Schildt Java: A Beginners Guide Page 456
		iOb = 2;

		switch (iOb) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Error");
		}
	}
}