package chapter_03;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 96
 * Demonstration of the use of the operator switch
 */

public class SwitchDemo {

	public static void main(String[] args) {
		
		int i, count = 0;

		for (i = 0; i < 10; i++) {
			
			switch (i) {
			
			case 0:
				System.out.println("i == 0, count = " + count);
				break;
			case 1:
				System.out.println("i == 1, count = " + count);
				break;
			case 2:
				System.out.println("i == 2, count = " + count);
				break;
			case 3:
				System.out.println("i == 3, count = " + count);
				break;
			case 4:
				System.out.println("i == 4, count = " + count);
				break;
			default:
				System.out.println("i >= 5, count = " + count);
			}
			
			count++;
			
		}
	}
}
