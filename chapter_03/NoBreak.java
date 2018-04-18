package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 98
 * Demonstration of the use of the operator "switch" without the operator "break"
 */

public class NoBreak {

	public static void main(String[] args) {
		
		int i, count = 0, inscount = 0;

		for (i = 0; i <= 5; i++) {

			switch (i) {
			case 0:
				System.out.println("i < 1, count = " + count + ", inscount = " + inscount);
				inscount++;
			case 1:
				System.out.println("i < 2, count = " + count  + ", inscount = " + inscount);
				inscount++;
			case 2:
				System.out.println("i < 3, count = " + count  + ", inscount = " + inscount);
				inscount++;
			case 3:
				System.out.println("i < 4, count = " + count  + ", inscount = " + inscount);
				inscount++;
			case 4:
				System.out.println("i < 5, count = " + count  + ", inscount = " + inscount);
				inscount++;
			}

			System.out.println();
			count++;

		}
		
		System.out.println("After for cycle");
	}
}