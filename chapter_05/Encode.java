package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 194
 * Use bitwise exclusive-OR operation to encrypt and decrypt messages
 */

public class Encode {

	public static void main(String[] args) {
		
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;

		System.out.print("Original message: ");
		System.out.println(msg);

		// Encrypt message
		for (int i = 0; i < msg.length(); i++)
			// Building an encrypted message line
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);

		System.out.print("\nEncrypted message: ");
		System.out.println(encmsg);

		// Decrypt the message
		for (int i = 0; i < msg.length(); i++)
			// Building a decrypted message line
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

		System.out.print("\nDecrypted message: ");
		System.out.println(decmsg);

	}
}