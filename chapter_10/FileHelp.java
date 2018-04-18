package chapter_10;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 391
 * Exercise 10.2
 */

public class FileHelp {

	public static void main(String[] args) {

		Help hlpobj = new Help("helpfile.txt");
		String topic;

		System.out.println("Use the help system.\n To log off, type 'stop'");
		do {
			topic = hlpobj.getSelection();

			if (!hlpobj.helpon(topic))
				System.out.println("The theme not find.\n");
		} while (topic.compareTo("stop") != 0);
	}
}