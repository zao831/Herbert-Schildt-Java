package chapter_02;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 78
 * Demonstration of the role of side effects
 */

public class SideEffects {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int i;
		i = 0;

		// The value of the variable "i" is incremented, despite the fact that the test
		// condition in the if statement is false
		if (false & (++i < 100))
			System.out.println("This string will not be displayed");
		System.out.println("The if statement is executed " + i); // Displayed 1

		// In this case, the value of the variable "i" is not incriminated, since the
		// second operand of the shortened logical operator is not computed, and
		// consequently, the increment is skipped
		if (false && (++i < 100))
			System.out.println("This string will not be displayed");
		System.out.println("The \"if\" operator is executed: " + i); // Still displays 1

	}
}
