package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 190
 * The simplest automated telephone directory
 */

public class Phone {

	public static void main(String[] args) {
		
		String[][] numbers = {
				
				{ "Tom", "555-3322" },
				{ "Mary", "555-8976" },
				{ "Jon", "555-1037" },
				{ "Rachel", "555-1400" }
				
		};
		
		int i;
		
		System.out.println(numbers.length);
		System.out.print(numbers[0].length + ", ");
		System.out.print(numbers[1].length + ", ");
		System.out.print(numbers[2].length + ", ");
		System.out.println(numbers[3].length + "\n");
		
		for(int k = 0; k < numbers.length; k++) {
			
			for(int j = 0; j < numbers[0].length; j++) {
				
				System.out.print(numbers[k][j] + ", ");
				
			}
			System.out.println();
			
		}
		
		// Passing the command line argument
		if(args.length != 1)
			System.out.println("\nUse: java Phone <name>");
		else {
			for(i = 0; i < numbers.length; i++) {
				
				if(numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + 
							": " + numbers[i][1]);
					break;
					
				}
			}
			
			if(i == numbers.length)
				System.out.println("Name is not found");
			
		}
	}
}