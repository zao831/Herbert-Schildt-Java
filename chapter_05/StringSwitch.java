package chapter_05;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 188
 * Using strings to control the "switch" operator
 */

public class StringSwitch {

	public static void main(String[] args) {

		String command = "cancel";

		switch (command) {

		case "connect":
			System.out.println("Connection");
			break;
		case "cancel":
			System.out.println("Cancel");
			break;
		case "disconnect":
			System.out.println("Disconnecting");
			break;
		default:
			System.out.println("Invalid command");
			break;

		}

	}
}