package chapter_05.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 202
 * Questions and exercises 
 * for self-examination
 * Question number 7
 */

public class Encode {

	public static void main(String[] args) {
		
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "This key";
		int j;
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		j = 0;
		
		for(int i = 0; i < msg.length(); i++) {
			
			encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
			if(j == 8) j = 0;
			
		}
		
		System.out.print("\nEncrypted message: ");
		System.out.println(encmsg);
		
		j = 0;
		
		for(int i = 0; i < msg.length(); i++) {
			
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
			if(j == 8) j = 0;	
			
		}	
		
		System.out.print("\nDecrypted message: ");
		System.out.println(decmsg);

	}
}