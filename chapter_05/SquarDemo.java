package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Personal, training example
 */

public class SquarDemo {

	public static void main(String[] args) {
		
		int[][][] t = new int[2][2][2]; // Square
		int count = 0; // Iteration counter

		// Display
		System.out.println("Array t[" + t.length + "]" + "[" + t[0].length + "]" + "[" + t[0][0].length + "];\n");

		// Fill in randomly
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				for (int k = 0; k < 2; k++) {
					
					count++; // Add
					t[i][j][k] = i + j + k;
					// Show what happened
					System.out.print(t[i][j][k] + " ");
					
				}
				System.out.println();
				
			}
			System.out.println();
			
		}
		System.out.println();

		// Show each element in the array
		System.out.print(t[0][0][0] + " ");
		System.out.print(t[0][1][0] + "\n");
		System.out.print(t[1][0][0] + " ");
		System.out.print(t[1][1][0] + "\n\n");
		System.out.print(t[0][0][1] + " ");
		System.out.print(t[0][1][1] + "\n");
		System.out.print(t[1][0][1] + " ");
		System.out.print(t[1][1][1] + "\n");

		// Show the number of iterations
		System.out.println("\ncount: " + count);

	}
}