package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Personal exercise with tags
 */

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		int i, count = 0;

		for (i = 0; i < 5; i++) {
			
			switch (i) {
			
			case 1:
			case 2:
			case 3:
				System.out.println("i == 1, 2 or 3, count = " + count);
				break;
				
			case 4:
				System.out.println("i == 4, count = " + count);
				break;
				
			}
			
			count++;
			
		}
	}
}
