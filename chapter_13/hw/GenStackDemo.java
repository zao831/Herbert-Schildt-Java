package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 */

public class GenStackDemo {

	public static void main(String[] args) {

		// Create a stack for storing integers
		Integer[] iStore = new Integer[10];
		GenStack<Integer> iStk = new GenStack<Integer>(iStore);
		Integer iVal;

		System.out.println("Demonstration of a stack of numbers of the type Integer: ");
		System.out.print("Adding");
		try {
			for (int i = 0; i < iStore.length; i++) {
				System.out.print(" " + i);
				iStk.push(i); // add an integer value to the stack iStk
			}
		} catch (StackFullExeption exc) {
			System.out.println(exc);
		}
		System.out.println(", in stack iStk");

		System.out.print("Stack contents iStk: ");
		try {
			for (int i = 0; i < iStore.length; i++) {
				iVal = iStk.get();
				System.out.print(iVal + " ");
			}
		} catch (StackEmptyExeption exc) {
			System.out.println(exc);
		}

		System.out.println("\n");

		// Create a stack for storing characters
		Character[] chStore = new Character[10];
		GenStack<Character> chStk = new GenStack<Character>(chStore);
		Character chVal;

		System.out.println("Demonstration of a stack of chars of the type Character: ");
		System.out.print("Adding");
		try {
			for (int i = 0; i < chStore.length; i++) {
				System.out.print(" " + (char) ('A' + i));
				chStk.push((char) ('A' + i));
			}
		} catch (StackFullExeption exc) {
			System.out.println(exc);
		}
		System.out.println(", in stack chStk");

		System.out.print("Stack contents chStk: ");
		try {
			for (int i = 0; i < chStore.length; i++) {
				chVal = chStk.get();
				System.out.print(chVal + " ");
			}
		} catch (StackEmptyExeption exc) {
			System.out.println(exc);
		}
	}
}