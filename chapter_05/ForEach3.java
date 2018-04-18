package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 */

public class ForEach3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		int[][][] t = new int[2][2][2];

		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				for (int k = 0; k < 2; k++) {
					
					t[i][j][k] = i + j + k;
					System.out.print(t[i][j][k] + " ");
					
				}
				System.out.println();
				
			}
			System.out.println();
			
		}

		System.out.print("Value: ");
		for (int x[][] : t) {
			
			for (int y[] : x) {
				
				for (int z : y) {
					
					count++;
					System.out.print(z + " ");
					sum += z;
					
				}
			}
		}
		
		System.out.println("\nSum: " + sum);
		System.out.println("Count: " + count);
		double c;
		c = (double) sum / count;
		System.out.println("Arithmetic mean: " + c);
		
	}
}