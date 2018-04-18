package chapter_09.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 351
 * Questions and exercises 
 * for self-examination
 * Question number 10
 */

public class StackDemo {

	public static void main(String[] args) throws Exception {

		// Create an empty stack of 10 elements
		Stack stk1 = new Stack(10);

		char[] name = { 'T', 'o', 'm' };

		// Create a stack from an array
		Stack stk2 = new Stack(name);

		char ch;
		int i;

		try {
			// Put characters on the stack stk1
			for (i = 0; i < 11; i++)
				stk1.push((char) ('A' + i));
		} catch (StackFullException exc) {
			System.out.println(exc);
		}

		// Create one stack from another stack
		Stack stk3 = new Stack(stk1);

		// Display stacks
		try {
			System.out.print("Content stk1: ");
			for (i = 0; i < 11; i++) {
				ch = stk1.pop();
				System.out.print(ch);
			}
		} catch (StackEmptyException exc) {
			System.out.println(exc);
		}

		System.out.print("\n");

		try {
			System.out.print("Content stk2: ");
			for (i = 0; i < 4; i++) {
				ch = stk2.pop();
				System.out.print(ch);
			}
		} catch (StackEmptyException exc) {
			System.out.println(exc);
		}

		System.out.print("\n");

		try {
			System.out.print("Content stk3: ");
			for (i = 0; i < 11; i++) {
				ch = stk3.pop();
				System.out.print(ch);
			}
		} catch (StackEmptyException exc) {
			System.out.println(exc);
		}
	}
}