package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 116
 * Using break operator with label
 */

public class Break4 {

	public static void main(String[] args) {

		int i;

		for (i = 1; i < 4; i++) {

			one: {
				two: {
					three: {

						System.out.println("\ni = " + i);
						if (i == 1)
							break one;
						if (i == 2)
							break two;
						if (i == 3)
							break three;

						// This line of code will never be reached

						System.out.println("null");

					}

					System.out.println("After three");

				}

				System.out.println("After two");

			}

			System.out.println("After one");

		}

		System.out.println("After for");

	}
}
