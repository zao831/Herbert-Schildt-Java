package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 */

public class GenStackDemo2 {

	public static void main(String[] args) {

		// Create a stack for storing integers
		Integer[] iStore = new Integer[10];
		GenStack2<Integer> stk1 = new GenStack2<Integer>(iStore);

		// Create stack for array
		String[] name = { "One", "Two", "Three" };
		String[] strStore = new String[3];
		GenStack2<String> stk2 = new GenStack2<String>(strStore, name);

		String str;
		int n;

		try {
			for (int i = 0; i < iStore.length; i++) {
				stk1.push(i);
			}
		} catch (StackFullExeption exc) {
			System.out.println(exc);
		}

		// One stack from another
		String[] strStore2 = new String[3];
		GenStack2<String> stk3 = new GenStack2<String>(strStore2, stk2);

		// Display all stacks
		try {
			System.out.print("stk1: ");
			for (int i = 0; i < iStore.length; i++) {
				n = stk1.get();
				System.out.print(n + " ");
			}

			System.out.println("\n");

			System.out.print("stk2: ");
			for (int i = 0; i < strStore2.length; i++) {
				str = stk2.get();
				System.out.print(str + " ");
			}

			System.out.println("\n");

			System.out.print("stk3: ");
			for (int i = 0; i < strStore2.length; i++) {
				str = stk3.get();
				System.out.print(str + " ");
			}

		} catch (StackEmptyExeption exc) {
			System.out.println(exc);
		}

		System.out.println();
	}
}