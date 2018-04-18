package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 243
 * Overloading a method with a variable number of arguments and uncertainty in the choice of an overloaded version
*/

public class VarArgs4 {

	// Using a list of arguments of variable length of type int
	static void vaTest(int... v) {
		// ...
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + ", ");
		System.out.println();
	}

	// Using a list of arguments of variable length of type int boolean
	static void vaTest(boolean... v) {
		// ...
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + ", ");
	}

	public static void main(String[] args) {
		VarArgs4.vaTest(1, 2, 3);// ok
		VarArgs4.vaTest(true, false, false);// ok

		// VarArgs4.vaTest(); // Ошибка! Неопределенность вызова

	}
}