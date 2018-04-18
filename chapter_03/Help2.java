package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 111
 * Exercise 3.2
 * An advanced help system in which the do-while loop is used to process the selection results from the menu
 */

public class Help2 {

	public static void main(String[] args) throws java.io.IOException {

		char ignore, choice;

		do {
			System.out.println("Reference: ");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. for");
			System.out.println("4. while");
			System.out.println("5. do-while\n");
			System.out.print("Select: ");

			choice = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while (choice < '1' | choice > '5');

		System.out.println("\n");

		switch (choice) {
		case '1':
			System.out.println("Operator if:\n");
			System.out.println("if(condition) operator;");
			System.out.println("else operator;");
			break;
		case '2':
			System.out.println("Operator switch:\n");
			System.out.println("switch (expression) {");
			System.out.println(" case constant:");
			System.out.println(" sequence of operators");
			System.out.println(" break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
		case '3':
			System.out.println("Operator for:\n");
			System.out.println("for (initialization; condition; iteration)");
			System.out.println(" operator;");
			break;
		case '4':
			System.out.println("Operator while:\n");
			System.out.println("while (condition) operator;");
			break;
		case '5':
			System.out.println("Operator do-while:\n");
			System.out.println("do {");
			System.out.println(" operator;");
			System.out.println("} while (condition);");
			break;

		}
	}
}
