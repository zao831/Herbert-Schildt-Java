package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Personal exercise with tags
 */

public class SwitchDemo3 {

	public static void main(String[] args) {

		char ch1 = 1, ch2 = 3;

		for (int i = 0; i < 1; i++) {

			switch (ch1) {
			
			case 1:
				System.out.println("This is section \"A\" of the external operator");
				
				switch (ch2) {

				case 3:
					System.out.println("This is section \"A\" of the internal operator");

				case 4:
					System.out.println("This is section \"B\" of the internal operator");

				} // End of internal operator
				
			case 2:
				System.out.println("This is section \"B\" of the external operator");
				break;

			}
		}
	}
}
