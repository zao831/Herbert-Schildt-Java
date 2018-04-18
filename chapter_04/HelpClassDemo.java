package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 147
 * Exercise 4.1
 * Converting to the help class of the help system from Exercise 3.3
 */

public class HelpClassDemo {

	public static void main(String[] args) throws java.io.IOException {

		char choice, ignore;
		Help hlpobj = new Help();

		for (;;) {
			do {
				hlpobj.showmenu();
				choice = (char) System.in.read();

				do {
					ignore = (char) System.in.read();

				} while (ignore != '\n');

			} while (!hlpobj.isvalid(choice));

			if (choice == 'q')
				break;

			System.out.println("\n");

			hlpobj.helpon(choice);

		}
	}
}