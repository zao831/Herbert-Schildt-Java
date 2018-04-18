package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 171
 * Using the variable of length
 */
	
public class LengthDemo {

	public static void main(String[] args) {
		
		int[] list = new int [10];
		int[] nums = {1, 2, 3};
		int[][] table = {
				
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9}
				
		};
		
		System.out.println("list size: " + list.length);
		System.out.println("nums size: " + nums.length);
		System.out.println("table size: " + table.length);
		System.out.println("table[0] size: " + table[0].length);
		System.out.println("table[1] size: " + table[1].length);
		System.out.println("table[2] size: " + table[2].length);
		
		
		// Use the variable length to initialize the list
		for(int i = 0; i < list.length; i++)
			list[i] = i * i;
		
		System.out.print("\nlist content: ");
		
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		
	}
}