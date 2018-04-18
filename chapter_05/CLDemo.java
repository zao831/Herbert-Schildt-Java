package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 189
 * Display all data specified in the command line
 */

public class CLDemo {

	public static void main(String[] args) {

		System.out.println("The program is passed " + args.length + " command-line arguments");

		System.out.println("Arguments list: ");

		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "]" + args[i]);

	}
}