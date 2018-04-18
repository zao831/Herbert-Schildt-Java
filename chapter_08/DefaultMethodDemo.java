package chapter_08;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 315
 */

public class DefaultMethodDemo {

	public static void main(String[] args) {

		MyIFImp obj = new MyIFImp();

		// Calling the getUserID() method is possible because it is explicitly
		// implemented by the MyIFImp class
		System.out.println("User ID " + obj.getUserID());

		// Calling the getAdminID() method is also possible, since its default
		// implementation is provided
		System.out.println("Admin ID " + obj.getAdminID());

	}
}