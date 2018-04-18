package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 169
 * Initializing a two-dimensional array
 * Added counting iteration cycles
 */

public class Squares {

	public static void main(String[] args) {
		
		int[][] sqrs = {
				
				{1, 1},
				{2, 4},
				{3, 9},
				{4, 16},
				{5, 25},
				{6, 36},
				{7, 49},
				{8, 64},
				{9, 81},
				{10, 100},
				
		};
		
		int i, j;
		int count1 = 0, count2 = 0;
		
		for(i = 0; i < 10; i++) {
			
			count1++;
			
			for(j = 0; j < 2; j++) {
				
				System.out.print(sqrs[i][j] + "\t");
			count2++;
			
			}
			
			System.out.println();
			
		}
		
		System.out.println("\ncount1: " + count1 + "\ncount2: " + count2);
		
	}
}