package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 146
 * Exercise 4.1
 * Converting to the help class of the help system from Exercise 3.3
 */

public class Help {

	void helpon(int what) {

		switch (what) {

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

		case '6':
			System.out.println("Operator break:\n");
			System.out.println("break; or break label;");
			break;

		case '7':
			System.out.println("Operator continue:\n");
			System.out.println("continue; or continue label;");
			break;

		}

		System.out.println();

	}

	void showmenu() {

		System.out.println("Reference: ");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("3. for");
		System.out.println("4. while");
		System.out.println("5. do-while");
		System.out.println("6. break");
		System.out.println("7. continue\n");
		System.out.print("Select the item for reference or press «q» to exit: ");

	}

	boolean isvalid(int ch) {

		if (ch < '1' | ch > '7' & ch != 'q')
			return false;
		else
			return true;

	}
}